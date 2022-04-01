package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class Item extends C1075c implements knh {
    public static final int ADD_TIME_FIELD_NUMBER = 1;
    public static final int ARTIST_METADATA_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Item DEFAULT_INSTANCE;
    private static volatile nqk<Item> PARSER = null;
    public static final int TRACK_METADATA_FIELD_NUMBER = 2;
    private int addTime_;
    private CollectionArtist artistMetadata_;
    private CollectionTrack trackMetadata_;

    /* renamed from: spotify.collection.esperanto.proto.Item$b */
    public static final class C6723b extends C1075c.C1076a implements knh {
        public C6723b(C6722a aVar) {
            super(Item.DEFAULT_INSTANCE);
        }
    }

    static {
        Item item = new Item();
        DEFAULT_INSTANCE = item;
        Class<Item> cls = Item.class;
        C1075c.registerDefaultInstance(Item.class, item);
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"addTime_", "trackMetadata_", "artistMetadata_"});
            case 3:
                return new Item();
            case 4:
                return new C6723b((C6722a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<Item> nqk = PARSER;
                if (nqk == null) {
                    Class<Item> cls = Item.class;
                    synchronized (Item.class) {
                        try {
                            nqk = PARSER;
                            if (nqk == null) {
                                nqk = new C1075c.C1077b(DEFAULT_INSTANCE);
                                PARSER = nqk;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return nqk;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o */
    public CollectionTrack mo66821o() {
        CollectionTrack collectionTrack = this.trackMetadata_;
        if (collectionTrack == null) {
            collectionTrack = CollectionTrack.m63538o();
        }
        return collectionTrack;
    }
}

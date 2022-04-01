package p015p;

import android.app.Activity;
import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.connectivity.flags.Flags;
import com.spotify.connectivity.flags.RxFlags;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.share.flow.C$AutoValue_ShareMenuData;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p.a00 */
public final class a00 implements syj {

    /* renamed from: a */
    public final /* synthetic */ int f54949a = 3;

    /* renamed from: b */
    public final Object f54950b;

    /* renamed from: c */
    public final Object f54951c;

    /* renamed from: d */
    public final Object f54952d;

    /* renamed from: t */
    public final Object f54953t;

    public /* synthetic */ a00(Activity activity, qjq qjq, msq msq, toq toq, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, qjq, msq, toq);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x00e6 A[EDGE_INSN: B:108:0x00e6->B:55:0x00e6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p015p.mhk mo46810a(p015p.tjm r32) {
        /*
            r31 = this;
            r0 = r31
            r0 = r31
            r1 = r32
            p.njm r11 = new p.njm
            p.tqa r2 = r1.f78231a
            p.kxq r12 = r2.f78470a
            p.qcm r13 = r1.f78232b
            boolean r4 = r1.f78233c
            p.mhk r5 = new p.mhk
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r5.<init>(r2)
            com.google.common.base.Optional r6 = r31.mo46812c(r32)
            com.google.common.base.Optional r7 = r1.f78235e
            boolean r14 = r1.f78236f
            p.tqa r2 = r1.f78231a
            p.aub r15 = r2.f78471b
            p.mpo r10 = r1.f78237g
            r1 = r11
            r1 = r11
            r2 = r12
            r2 = r12
            r3 = r13
            r3 = r13
            r8 = r14
            r8 = r14
            r9 = r15
            r9 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            p.mhk r1 = new p.mhk
            p.whm r2 = new p.whm
            java.lang.Object r3 = r0.f54950b
            p.lyq r3 = (p015p.lyq) r3
            java.util.Objects.requireNonNull(r3)
            p.lvq r4 = r12.f67448a
            boolean r5 = r4.f68607p
            java.lang.String r6 = r4.f68595d
            java.lang.String r7 = r4.f68596e
            p.nb6 r4 = r4.f68598g
            r8 = 3
            java.lang.String r19 = r4.mo36255b(r8)
            p.lvq r4 = r12.f67448a
            java.lang.String r4 = r4.f68592a
            p.aub r8 = p015p.aub.UNFOLLOWED
            r10 = 1
            if (r15 == r8) goto L_0x0058
            r21 = 1
            goto L_0x005a
        L_0x0058:
            r21 = 0
        L_0x005a:
            boolean r8 = r13 instanceof p015p.ncm
            if (r8 != 0) goto L_0x0074
            boolean r8 = r13 instanceof p015p.ocm
            if (r8 == 0) goto L_0x0063
            goto L_0x0074
        L_0x0063:
            p.pcm r13 = (p015p.pcm) r13
            boolean r8 = r13.f72588f
            if (r8 == 0) goto L_0x0074
            java.lang.String r8 = r13.f72587e
            boolean r8 = p015p.lat.m42680e(r8, r4)
            if (r8 == 0) goto L_0x0074
            r23 = 1
            goto L_0x0076
        L_0x0074:
            r23 = 0
        L_0x0076:
            boolean r8 = r3.f68687a
            if (r8 == 0) goto L_0x007f
            if (r5 != 0) goto L_0x007f
            r24 = 1
            goto L_0x0081
        L_0x007f:
            r24 = 0
        L_0x0081:
            p.aub r13 = p015p.aub.FOLLOWED_AND_SUBSCRIBED
            if (r15 != r13) goto L_0x0088
            r25 = 1
            goto L_0x008a
        L_0x0088:
            r25 = 0
        L_0x008a:
            if (r8 == 0) goto L_0x0091
            if (r14 != 0) goto L_0x0091
            r26 = 1
            goto L_0x0093
        L_0x0091:
            r26 = 0
        L_0x0093:
            p.lvq r8 = r12.f67448a
            p.yph r8 = r8.f68608q
            p.lh4 r8 = r8.f48649b
            if (r8 != 0) goto L_0x009e
            r27 = 0
            goto L_0x00a4
        L_0x009e:
            java.lang.String r8 = r8.f34933b
            r27 = r8
            r27 = r8
        L_0x00a4:
            p.odg r8 = new p.odg
            java.util.List r12 = r12.f67449b
            boolean r14 = r12 instanceof java.util.Collection
            if (r14 == 0) goto L_0x00b3
            boolean r14 = r12.isEmpty()
            if (r14 == 0) goto L_0x00b3
            goto L_0x00e6
        L_0x00b3:
            java.util.Iterator r12 = r12.iterator()
        L_0x00b7:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00e6
            java.lang.Object r14 = r12.next()
            p.x2a r14 = (p015p.x2a) r14
            p.yph r14 = r14.f82385E
            p.zlm r14 = r14.f48662o
            if (r14 != 0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            boolean r15 = r14.f49693a
            if (r15 != r10) goto L_0x00d0
            r15 = 1
            goto L_0x00d1
        L_0x00d0:
            r15 = 0
        L_0x00d1:
            if (r15 == 0) goto L_0x00e1
            if (r14 != 0) goto L_0x00d6
            goto L_0x00dc
        L_0x00d6:
            boolean r14 = r14.f49694b
            if (r14 != 0) goto L_0x00dc
            r14 = 1
            goto L_0x00dd
        L_0x00dc:
            r14 = 0
        L_0x00dd:
            if (r14 == 0) goto L_0x00e1
            r14 = 1
            goto L_0x00e2
        L_0x00e1:
            r14 = 0
        L_0x00e2:
            if (r14 == 0) goto L_0x00b7
            r12 = 1
            goto L_0x00e7
        L_0x00e6:
            r12 = 0
        L_0x00e7:
            p.kxq r14 = r11.f70485a
            p.lvq r14 = r14.f67448a
            p.yph r15 = r14.f68608q
            p.svq r15 = r15.f48654g
            if (r15 != 0) goto L_0x00f3
            r15 = 0
            goto L_0x00f5
        L_0x00f3:
            p.rvq r15 = r15.f41149a
        L_0x00f5:
            r8.<init>(r12, r15)
            boolean r3 = r3.f68688b
            if (r3 == 0) goto L_0x0101
            if (r5 == 0) goto L_0x0101
            r28 = 1
            goto L_0x0103
        L_0x0101:
            r28 = 0
        L_0x0103:
            java.lang.String r3 = r14.f68603l
            boolean r5 = p015p.jps.m56406C(r3)
            r5 = r5 ^ r10
            if (r5 == 0) goto L_0x0111
        L_0x010c:
            r30 = r3
            r30 = r3
            goto L_0x014e
        L_0x0111:
            p.kxq r3 = r11.f70485a
            java.util.List r3 = r3.f67449b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x011e:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x013b
            java.lang.Object r12 = r3.next()
            r14 = r12
            r14 = r12
            p.x2a r14 = (p015p.x2a) r14
            p.u2a r14 = r14.f82384D
            p.u2a r15 = p015p.u2a.f78983b
            if (r14 == r15) goto L_0x0134
            r14 = 1
            goto L_0x0135
        L_0x0134:
            r14 = 0
        L_0x0135:
            if (r14 == 0) goto L_0x011e
            r5.add(r12)
            goto L_0x011e
        L_0x013b:
            boolean r3 = r5.isEmpty()
            r3 = r3 ^ r10
            if (r3 == 0) goto L_0x014b
            java.lang.Object r3 = p015p.lr4.m57268Z(r5)
            p.x2a r3 = (p015p.x2a) r3
            java.lang.String r3 = r3.f82386a
            goto L_0x010c
        L_0x014b:
            java.lang.String r3 = ""
            goto L_0x010c
        L_0x014e:
            p.ejm r3 = new p.ejm
            r22 = 0
            r16 = r3
            r16 = r3
            r17 = r6
            r17 = r6
            r18 = r7
            r18 = r7
            r20 = r4
            r20 = r4
            r29 = r8
            r29 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r4 = r0.f54951c
            p.p45 r4 = (p015p.p45) r4
            java.util.Objects.requireNonNull(r4)
            p.kxq r5 = r11.f70485a
            java.util.List r6 = r5.f67449b
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = p015p.hr4.m55589H(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r6.iterator()
            r12 = 0
        L_0x0184:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x0207
            java.lang.Object r14 = r8.next()
            int r23 = r12 + 1
            if (r12 < 0) goto L_0x0202
            r15 = r14
            r15 = r14
            p.x2a r15 = (p015p.x2a) r15
            java.lang.String r14 = r15.f82386a
            p.lvq r9 = r5.f67448a
            java.lang.String r9 = r9.f68600i
            boolean r9 = p015p.lat.m42680e(r14, r9)
            if (r9 == 0) goto L_0x01a4
            r0 = 0
            goto L_0x01f5
        L_0x01a4:
            boolean r9 = r11.f70487c
            if (r9 != 0) goto L_0x01b4
            boolean r9 = r15.f82408w
            if (r9 != 0) goto L_0x01b1
            boolean r9 = r15.f82398m
            if (r9 != 0) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r18 = 0
            goto L_0x01b6
        L_0x01b4:
            r18 = 1
        L_0x01b6:
            p.vba r9 = new p.vba
            p.lvq r14 = r5.f67448a
            java.lang.String r14 = r14.f68595d
            int r16 = r6.size()
            int r10 = r16 + -1
            if (r12 != r10) goto L_0x01c7
            r19 = 1
            goto L_0x01c9
        L_0x01c7:
            r19 = 0
        L_0x01c9:
            p.p4a r21 = r4.mo36767g(r11)
            p.kpo r10 = new p.kpo
            p.mpo r13 = r11.f70493i
            boolean r0 = r13.f69497a
            boolean r13 = r13.f69498b
            r10.<init>(r0, r13)
            r0 = r14
            r0 = r14
            r14 = r9
            r14 = r9
            r13 = r15
            r13 = r15
            r15 = r0
            r15 = r0
            r16 = r13
            r16 = r13
            r17 = r6
            r17 = r6
            r20 = r12
            r20 = r12
            r22 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            p.q3a r0 = r4.mo36766f(r9)
        L_0x01f5:
            r7.add(r0)
            r0 = r31
            r0 = r31
            r12 = r23
            r12 = r23
            r10 = 1
            goto L_0x0184
        L_0x0202:
            p015p.u5i.m60999D()
            r0 = 0
            throw r0
        L_0x0207:
            java.util.List r0 = p015p.lr4.m57266X(r7)
            r2.<init>(r11, r3, r0)
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p015p.a00.mo46810a(p.tjm):p.mhk");
    }

    public jxj apply(mrj mrj) {
        switch (this.f54949a) {
            case 0:
                String str = (String) this.f54950b;
                mrj d0 = ((CollectionStateProvider) this.f54953t).mo30583d(str, str, str).mo63459d0(new vq4(this));
                rjb rjb = (rjb) this.f54952d;
                Objects.requireNonNull(rjb);
                return mrj.m57667g(mrj, d0, new muj((lln) rjb).mo63442P(new p7q(this), false, Integer.MAX_VALUE).mo63414A(), new hl6(this));
            case 1:
                return mrj.mo63459d0(new bdb(this));
            case 2:
                rjb<Flags> flags = ((RxFlags) this.f54951c).flags();
                Objects.requireNonNull(flags);
                return new vyj(mrj, dxs.f89817e, new muj((lln) flags)).mo63442P(wzl.f103921U, false, Integer.MAX_VALUE).mo63461i0((ddp) this.f54952d).mo63442P(new s5a(this), false, Integer.MAX_VALUE);
            default:
                return mrj.mo63442P(new pcq(this), false, Integer.MAX_VALUE);
        }
    }

    /* renamed from: b */
    public ohk mo46811b(ohk ohk) {
        ohk ohk2;
        Objects.requireNonNull(ohk);
        if (ohk instanceof khk) {
            ohk2 = (khk) ohk;
        } else {
            ohk2 = mo46810a((tjm) ohk.mo52901b());
        }
        return ohk2;
    }

    /* renamed from: c */
    public Optional mo46812c(tjm tjm) {
        Optional optional;
        if (((Boolean) ((hkn) this.f54952d).get()).booleanValue()) {
            optional = mo46814e(tjm.f78231a.f78470a);
        } else {
            optional = tjm.f78234d;
        }
        return optional;
    }

    /* renamed from: d */
    public void mo46813d(qnq qnq, String str) {
        ((uoq) ((toq) this.f54953t)).mo65394d(((y12) qnq.f74575b).f104710d, qnq.f74577d, ((C$AutoValue_ShareMenuData) qnq.f74574a).f85754d.f85827a, str);
    }

    /* renamed from: e */
    public Optional mo46814e(kxq kxq) {
        Optional optional;
        xrc xrc = kxq.f67448a.f68608q.f48658k;
        if (xrc == null) {
            optional = null;
        } else {
            optional = Optional.m3982of(((hbc) this.f54953t).invoke(xrc));
        }
        if (optional == null) {
            optional = Optional.absent();
        }
        return optional;
    }

    public a00(Activity activity, qjq qjq, msq msq, toq toq) {
        this.f54950b = activity;
        this.f54951c = qjq;
        this.f54952d = msq;
        this.f54953t = toq;
    }

    public a00(lyq lyq, p45 p45, hkn hkn, hbc hbc) {
        this.f54950b = lyq;
        this.f54951c = p45;
        this.f54952d = hkn;
        this.f54953t = hbc;
    }

    public a00(String str, String str2, rjb rjb, CollectionStateProvider collectionStateProvider) {
        this.f54950b = str;
        this.f54951c = str2;
        this.f54952d = rjb;
        this.f54953t = collectionStateProvider;
    }

    public a00(Context context, RxFlags rxFlags, ddp ddp, cgr cgr) {
        this.f54950b = context;
        this.f54951c = rxFlags;
        this.f54952d = ddp;
        this.f54953t = cgr;
    }
}

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrustStoreRevocation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrRevocationId(): Number = unwrap(this).getAttrRevocationId()

  public open fun attrTrustStoreRevocations(): IResolvable =
      unwrap(this).getAttrTrustStoreRevocations().let(IResolvable::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun revocationContents(): Any? = unwrap(this).getRevocationContents()

  public open fun revocationContents(`value`: IResolvable) {
    unwrap(this).setRevocationContents(`value`.let(IResolvable::unwrap))
  }

  public open fun revocationContents(__idx_ac66f0: List<Any>) {
    unwrap(this).setRevocationContents(__idx_ac66f0)
  }

  public open fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

  public open fun trustStoreArn(`value`: String) {
    unwrap(this).setTrustStoreArn(`value`)
  }

  public interface Builder {
    public fun revocationContents(revocationContents: IResolvable)

    public fun revocationContents(revocationContents: List<Any>)

    public fun trustStoreArn(trustStoreArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.Builder.create(scope,
        id)

    override fun revocationContents(revocationContents: IResolvable) {
      cdkBuilder.revocationContents(revocationContents.let(IResolvable::unwrap))
    }

    override fun revocationContents(revocationContents: List<Any>) {
      cdkBuilder.revocationContents(revocationContents)
    }

    override fun trustStoreArn(trustStoreArn: String) {
      cdkBuilder.trustStoreArn(trustStoreArn)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrustStoreRevocation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrustStoreRevocation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation):
        CfnTrustStoreRevocation = CfnTrustStoreRevocation(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStoreRevocation):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation =
        wrapped.cdkObject
  }

  public interface RevocationContentProperty {
    public fun revocationType(): String? = unwrap(this).getRevocationType()

    public fun s3Bucket(): String? = unwrap(this).getS3Bucket()

    public fun s3Key(): String? = unwrap(this).getS3Key()

    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    public interface Builder {
      public fun revocationType(revocationType: String)

      public fun s3Bucket(s3Bucket: String)

      public fun s3Key(s3Key: String)

      public fun s3ObjectVersion(s3ObjectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty.builder()

      override fun revocationType(revocationType: String) {
        cdkBuilder.revocationType(revocationType)
      }

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty,
    ) : RevocationContentProperty {
      override fun revocationType(): String? = unwrap(this).getRevocationType()

      override fun s3Bucket(): String? = unwrap(this).getS3Bucket()

      override fun s3Key(): String? = unwrap(this).getS3Key()

      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RevocationContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty):
          RevocationContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RevocationContentProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrustStoreRevocationProperty {
    public fun numberOfRevokedEntries(): Number? = unwrap(this).getNumberOfRevokedEntries()

    public fun revocationId(): String? = unwrap(this).getRevocationId()

    public fun revocationType(): String? = unwrap(this).getRevocationType()

    public fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

    public interface Builder {
      public fun numberOfRevokedEntries(numberOfRevokedEntries: Number)

      public fun revocationId(revocationId: String)

      public fun revocationType(revocationType: String)

      public fun trustStoreArn(trustStoreArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty.builder()

      override fun numberOfRevokedEntries(numberOfRevokedEntries: Number) {
        cdkBuilder.numberOfRevokedEntries(numberOfRevokedEntries)
      }

      override fun revocationId(revocationId: String) {
        cdkBuilder.revocationId(revocationId)
      }

      override fun revocationType(revocationType: String) {
        cdkBuilder.revocationType(revocationType)
      }

      override fun trustStoreArn(trustStoreArn: String) {
        cdkBuilder.trustStoreArn(trustStoreArn)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty,
    ) : TrustStoreRevocationProperty {
      override fun numberOfRevokedEntries(): Number? = unwrap(this).getNumberOfRevokedEntries()

      override fun revocationId(): String? = unwrap(this).getRevocationId()

      override fun revocationType(): String? = unwrap(this).getRevocationType()

      override fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrustStoreRevocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty):
          TrustStoreRevocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrustStoreRevocationProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

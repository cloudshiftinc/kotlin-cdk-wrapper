@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessPoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAlias(): String = unwrap(this).getAttrAlias()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrNetworkOrigin(): String = unwrap(this).getAttrNetworkOrigin()

  public open fun bucket(): String = unwrap(this).getBucket()

  public open fun bucket(`value`: String) {
    unwrap(this).setBucket(`value`)
  }

  public open fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

  public open fun bucketAccountId(`value`: String) {
    unwrap(this).setBucketAccountId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun policy(): Any? = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public open fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  public open fun publicAccessBlockConfiguration(`value`: IResolvable) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(PublicAccessBlockConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c05a501d864efbe323e5985f14b7f6248863b7861ff8a00b1a0a6e2ff63d2782")
  public open
      fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
      Unit = publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(`value`))

  public open fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  public open fun vpcConfiguration(`value`: IResolvable) {
    unwrap(this).setVpcConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfiguration(`value`: VpcConfigurationProperty) {
    unwrap(this).setVpcConfiguration(`value`.let(VpcConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9b6fa3968887f57728a3c211ce41993d6a404130a54eaf5a7c2e6a141ba9b889")
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty.Builder.() -> Unit): Unit =
      vpcConfiguration(VpcConfigurationProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: String)

    public fun bucketAccountId(bucketAccountId: String)

    public fun name(name: String)

    public fun policy(policy: Any)

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a94e44c5767736663ba688d54f25e54ade02ad65a0049a0b3b529ad589955982")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85c47197668efa14d7c0432310d8ae12067385700d95791716f25d33e98362b8")
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessPoint.Builder =
        software.amazon.awscdk.services.s3.CfnAccessPoint.Builder.create(scope, id)

    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    override fun bucketAccountId(bucketAccountId: String) {
      cdkBuilder.bucketAccountId(bucketAccountId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(PublicAccessBlockConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a94e44c5767736663ba688d54f25e54ade02ad65a0049a0b3b529ad589955982")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85c47197668efa14d7c0432310d8ae12067385700d95791716f25d33e98362b8")
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessPoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3.CfnAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint): CfnAccessPoint
        = CfnAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPoint): software.amazon.awscdk.services.s3.CfnAccessPoint
        = wrapped.cdkObject
  }

  public interface VpcConfigurationProperty {
    public fun vpcId(): String? = unwrap(this).getVpcId()

    @CdkDslMarker
    public interface Builder {
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty.builder()

      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty,
    ) : CdkObject(cdkObject), VpcConfigurationProperty {
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty
    }
  }

  public interface PublicAccessBlockConfigurationProperty {
    public fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

    public fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

    public fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

    public fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()

    @CdkDslMarker
    public interface Builder {
      public fun blockPublicAcls(blockPublicAcls: Boolean)

      public fun blockPublicAcls(blockPublicAcls: IResolvable)

      public fun blockPublicPolicy(blockPublicPolicy: Boolean)

      public fun blockPublicPolicy(blockPublicPolicy: IResolvable)

      public fun ignorePublicAcls(ignorePublicAcls: Boolean)

      public fun ignorePublicAcls(ignorePublicAcls: IResolvable)

      public fun restrictPublicBuckets(restrictPublicBuckets: Boolean)

      public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder()

      override fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
      }

      override fun blockPublicAcls(blockPublicAcls: IResolvable) {
        cdkBuilder.blockPublicAcls(blockPublicAcls.let(IResolvable::unwrap))
      }

      override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
      }

      override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
      }

      override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
      }

      override fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls.let(IResolvable::unwrap))
      }

      override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
      }

      override fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty,
    ) : CdkObject(cdkObject), PublicAccessBlockConfigurationProperty {
      override fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

      override fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

      override fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

      override fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PublicAccessBlockConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty):
          PublicAccessBlockConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessBlockConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty
    }
  }
}

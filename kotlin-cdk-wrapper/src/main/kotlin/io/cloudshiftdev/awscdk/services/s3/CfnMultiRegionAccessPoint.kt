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
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMultiRegionAccessPoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAlias(): String = unwrap(this).getAttrAlias()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
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
  @JvmName("c390c16087080e9d6b36faced5b46f09f3f88fc6960bb7e21b02fac4f8becfda")
  public open
      fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
      Unit = publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(`value`))

  public open fun regions(): Any = unwrap(this).getRegions()

  public open fun regions(`value`: IResolvable) {
    unwrap(this).setRegions(`value`.let(IResolvable::unwrap))
  }

  public open fun regions(__idx_ac66f0: List<Any>) {
    unwrap(this).setRegions(__idx_ac66f0)
  }

  public open fun regions(vararg __idx_ac66f0: Any): Unit = regions(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20f6a7f47a3bc4cd686a60978549578e0dd3252392a493f7262eb0a74e430e1c")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    public fun regions(regions: IResolvable)

    public fun regions(regions: List<Any>)

    public fun regions(vararg regions: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.Builder =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(PublicAccessBlockConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20f6a7f47a3bc4cd686a60978549578e0dd3252392a493f7262eb0a74e430e1c")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    override fun regions(regions: IResolvable) {
      cdkBuilder.regions(regions.let(IResolvable::unwrap))
    }

    override fun regions(regions: List<Any>) {
      cdkBuilder.regions(regions)
    }

    override fun regions(vararg regions: Any): Unit = regions(regions.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMultiRegionAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMultiRegionAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint):
        CfnMultiRegionAccessPoint = CfnMultiRegionAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionAccessPoint):
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint = wrapped.cdkObject
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
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.builder()

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
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty):
          PublicAccessBlockConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessBlockConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty
    }
  }

  public interface RegionProperty {
    public fun bucket(): String

    public fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

    @CdkDslMarker
    public interface Builder {
      public fun bucket(bucket: String)

      public fun bucketAccountId(bucketAccountId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun bucketAccountId(bucketAccountId: String) {
        cdkBuilder.bucketAccountId(bucketAccountId)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty,
    ) : CdkObject(cdkObject), RegionProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty):
          RegionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionProperty):
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty
    }
  }
}

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMultiRegionAccessPoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public interface Builder {
    public fun name(name: String) {
    }

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
    }

    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20f6a7f47a3bc4cd686a60978549578e0dd3252392a493f7262eb0a74e430e1c")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit) {
    }

    public fun regions(regions: IResolvable) {
    }

    public fun regions(regions: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.Builder =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.Builder.create(scope, id)

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(PublicAccessBlockConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20f6a7f47a3bc4cd686a60978549578e0dd3252392a493f7262eb0a74e430e1c")
    public override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    public override fun regions(regions: IResolvable) {
      cdkBuilder.regions(regions.let(IResolvable::unwrap))
    }

    public override fun regions(regions: List<Any>) {
      cdkBuilder.regions(regions)
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun blockPublicAcls(blockPublicAcls: Boolean) {
      }

      public fun blockPublicAcls(blockPublicAcls: IResolvable) {
      }

      public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
      }

      public fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
      }

      public fun ignorePublicAcls(ignorePublicAcls: Boolean) {
      }

      public fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
      }

      public fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
      }

      public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.builder()

      public override fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
      }

      public override fun blockPublicAcls(blockPublicAcls: IResolvable) {
        cdkBuilder.blockPublicAcls(blockPublicAcls.let(IResolvable::unwrap))
      }

      public override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
      }

      public override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
      }

      public override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
      }

      public override fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls.let(IResolvable::unwrap))
      }

      public override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
      }

      public override fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty,
    ) : PublicAccessBlockConfigurationProperty {
      public override fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

      public override fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

      public override fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

      public override fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RegionProperty {
    public fun bucket(): String

    public fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

    public interface Builder {
      public fun bucket(bucket: String) {
      }

      public fun bucketAccountId(bucketAccountId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty.builder()

      public override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      public override fun bucketAccountId(bucketAccountId: String) {
        cdkBuilder.bucketAccountId(bucketAccountId)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty,
    ) : RegionProperty {
      public override fun bucket(): String = unwrap(this).getBucket()

      public override fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty):
          RegionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionProperty):
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

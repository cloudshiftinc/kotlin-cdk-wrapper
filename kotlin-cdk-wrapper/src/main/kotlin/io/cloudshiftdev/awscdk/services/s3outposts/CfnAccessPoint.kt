@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessPoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPoint,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun bucket(): String = unwrap(this).getBucket()

  public open fun bucket(`value`: String) {
    unwrap(this).setBucket(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun policy(): Any? = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public open fun vpcConfiguration(): Any = unwrap(this).getVpcConfiguration()

  public open fun vpcConfiguration(`value`: IResolvable) {
    unwrap(this).setVpcConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfiguration(`value`: VpcConfigurationProperty) {
    unwrap(this).setVpcConfiguration(`value`.let(VpcConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80240af01eeeeeb9f055a0e42db4eb9c151b604d88b6afc33dde3576f40af094")
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty.Builder.() -> Unit): Unit =
      vpcConfiguration(VpcConfigurationProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: String)

    public fun name(name: String)

    public fun policy(policy: Any)

    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("976c8b71b8c4dac1e1cfbe46758d9b84a482e26bcb0925e996378f22936c0789")
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnAccessPoint.Builder =
        software.amazon.awscdk.services.s3outposts.CfnAccessPoint.Builder.create(scope, id)

    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("976c8b71b8c4dac1e1cfbe46758d9b84a482e26bcb0925e996378f22936c0789")
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnAccessPoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3outposts.CfnAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPoint):
        CfnAccessPoint = CfnAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPoint):
        software.amazon.awscdk.services.s3outposts.CfnAccessPoint = wrapped.cdkObject
  }

  public interface VpcConfigurationProperty {
    public fun vpcId(): String? = unwrap(this).getVpcId()

    @CdkDslMarker
    public interface Builder {
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty.builder()

      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty,
    ) : CdkObject(cdkObject), VpcConfigurationProperty {
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty
    }
  }
}

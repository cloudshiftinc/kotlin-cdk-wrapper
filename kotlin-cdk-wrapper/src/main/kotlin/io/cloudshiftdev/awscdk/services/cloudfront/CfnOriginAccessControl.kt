@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

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

public open class CfnOriginAccessControl internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun originAccessControlConfig(): Any = unwrap(this).getOriginAccessControlConfig()

  public open fun originAccessControlConfig(`value`: IResolvable) {
    unwrap(this).setOriginAccessControlConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun originAccessControlConfig(`value`: OriginAccessControlConfigProperty) {
    unwrap(this).setOriginAccessControlConfig(`value`.let(OriginAccessControlConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eb7ae7106b477a120b6b4eb2959987a5ab0137855fe4c359219cc0c89a09279")
  public open
      fun originAccessControlConfig(`value`: OriginAccessControlConfigProperty.Builder.() -> Unit):
      Unit = originAccessControlConfig(OriginAccessControlConfigProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun originAccessControlConfig(originAccessControlConfig: IResolvable)

    public
        fun originAccessControlConfig(originAccessControlConfig: OriginAccessControlConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("361ff33cabc99e16410906f2dac29bca4d560587ad47173768c86bb19a7ec07c")
    public
        fun originAccessControlConfig(originAccessControlConfig: OriginAccessControlConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.Builder =
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.Builder.create(scope, id)

    override fun originAccessControlConfig(originAccessControlConfig: IResolvable) {
      cdkBuilder.originAccessControlConfig(originAccessControlConfig.let(IResolvable::unwrap))
    }

    override
        fun originAccessControlConfig(originAccessControlConfig: OriginAccessControlConfigProperty) {
      cdkBuilder.originAccessControlConfig(originAccessControlConfig.let(OriginAccessControlConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("361ff33cabc99e16410906f2dac29bca4d560587ad47173768c86bb19a7ec07c")
    override
        fun originAccessControlConfig(originAccessControlConfig: OriginAccessControlConfigProperty.Builder.() -> Unit):
        Unit =
        originAccessControlConfig(OriginAccessControlConfigProperty(originAccessControlConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOriginAccessControl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOriginAccessControl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl):
        CfnOriginAccessControl = CfnOriginAccessControl(cdkObject)

    internal fun unwrap(wrapped: CfnOriginAccessControl):
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl = wrapped.cdkObject
  }

  public interface OriginAccessControlConfigProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String

    public fun originAccessControlOriginType(): String

    public fun signingBehavior(): String

    public fun signingProtocol(): String

    @CdkDslMarker
    public interface Builder {
      public fun description(description: String)

      public fun name(name: String)

      public fun originAccessControlOriginType(originAccessControlOriginType: String)

      public fun signingBehavior(signingBehavior: String)

      public fun signingProtocol(signingProtocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun originAccessControlOriginType(originAccessControlOriginType: String) {
        cdkBuilder.originAccessControlOriginType(originAccessControlOriginType)
      }

      override fun signingBehavior(signingBehavior: String) {
        cdkBuilder.signingBehavior(signingBehavior)
      }

      override fun signingProtocol(signingProtocol: String) {
        cdkBuilder.signingProtocol(signingProtocol)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty,
    ) : CdkObject(cdkObject), OriginAccessControlConfigProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun name(): String = unwrap(this).getName()

      override fun originAccessControlOriginType(): String =
          unwrap(this).getOriginAccessControlOriginType()

      override fun signingBehavior(): String = unwrap(this).getSigningBehavior()

      override fun signingProtocol(): String = unwrap(this).getSigningProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OriginAccessControlConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty):
          OriginAccessControlConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginAccessControlConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty
    }
  }
}

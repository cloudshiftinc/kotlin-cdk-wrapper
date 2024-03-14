package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPoolDomain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomain,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCloudFrontDistribution(): String =
      unwrap(this).getAttrCloudFrontDistribution()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun customDomainConfig(): Any? = unwrap(this).getCustomDomainConfig()

  public open fun customDomainConfig(`value`: IResolvable) {
    unwrap(this).setCustomDomainConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun customDomainConfig(`value`: CustomDomainConfigTypeProperty) {
    unwrap(this).setCustomDomainConfig(`value`.let(CustomDomainConfigTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1932f678847ff4299bca23a5d423a85459cd42342059083e2bf00dfea8c6e3e6")
  public open fun customDomainConfig(`value`: CustomDomainConfigTypeProperty.Builder.() -> Unit):
      Unit = customDomainConfig(CustomDomainConfigTypeProperty(`value`))

  public open fun domain(): String = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  public interface Builder {
    public fun customDomainConfig(customDomainConfig: IResolvable)

    public fun customDomainConfig(customDomainConfig: CustomDomainConfigTypeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cf6387ed90ec3bbfadd8ec8bba7bed73b53ba81c79e21cfa5ebaf2158605e86")
    public
        fun customDomainConfig(customDomainConfig: CustomDomainConfigTypeProperty.Builder.() -> Unit)

    public fun domain(domain: String)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolDomain.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolDomain.Builder.create(scope, id)

    override fun customDomainConfig(customDomainConfig: IResolvable) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(IResolvable::unwrap))
    }

    override fun customDomainConfig(customDomainConfig: CustomDomainConfigTypeProperty) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(CustomDomainConfigTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cf6387ed90ec3bbfadd8ec8bba7bed73b53ba81c79e21cfa5ebaf2158605e86")
    override
        fun customDomainConfig(customDomainConfig: CustomDomainConfigTypeProperty.Builder.() -> Unit):
        Unit = customDomainConfig(CustomDomainConfigTypeProperty(customDomainConfig))

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolDomain =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomain):
        CfnUserPoolDomain = CfnUserPoolDomain(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolDomain):
        software.amazon.awscdk.services.cognito.CfnUserPoolDomain = wrapped.cdkObject
  }

  public interface CustomDomainConfigTypeProperty {
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    public interface Builder {
      public fun certificateArn(certificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty,
    ) : CustomDomainConfigTypeProperty {
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomDomainConfigTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty):
          CustomDomainConfigTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomDomainConfigTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}

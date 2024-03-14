package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emr.CfnSecurityConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun securityConfiguration(): Any = unwrap(this).getSecurityConfiguration()

  public open fun securityConfiguration(`value`: Any) {
    unwrap(this).setSecurityConfiguration(`value`)
  }

  public interface Builder {
    public fun name(name: String)

    public fun securityConfiguration(securityConfiguration: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnSecurityConfiguration.Builder =
        software.amazon.awscdk.services.emr.CfnSecurityConfiguration.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun securityConfiguration(securityConfiguration: Any) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnSecurityConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnSecurityConfiguration):
        CfnSecurityConfiguration = CfnSecurityConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfiguration):
        software.amazon.awscdk.services.emr.CfnSecurityConfiguration = wrapped.cdkObject
  }
}

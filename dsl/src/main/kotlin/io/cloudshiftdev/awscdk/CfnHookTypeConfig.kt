package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHookTypeConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnHookTypeConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrConfigurationArn(): String = unwrap(this).getAttrConfigurationArn()

  public open fun configuration(): String = unwrap(this).getConfiguration()

  public open fun configuration(`value`: String) {
    unwrap(this).setConfiguration(`value`)
  }

  public open fun configurationAlias(): String? = unwrap(this).getConfigurationAlias()

  public open fun configurationAlias(`value`: String) {
    unwrap(this).setConfigurationAlias(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun typeArn(): String? = unwrap(this).getTypeArn()

  public open fun typeArn(`value`: String) {
    unwrap(this).setTypeArn(`value`)
  }

  public open fun typeName(): String? = unwrap(this).getTypeName()

  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  public interface Builder {
    public fun configuration(configuration: String) {
    }

    public fun configurationAlias(configurationAlias: String) {
    }

    public fun typeArn(typeArn: String) {
    }

    public fun typeName(typeName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookTypeConfig.Builder =
        software.amazon.awscdk.CfnHookTypeConfig.Builder.create(scope, id)

    public override fun configuration(configuration: String) {
      cdkBuilder.configuration(configuration)
    }

    public override fun configurationAlias(configurationAlias: String) {
      cdkBuilder.configurationAlias(configurationAlias)
    }

    public override fun typeArn(typeArn: String) {
      cdkBuilder.typeArn(typeArn)
    }

    public override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnHookTypeConfig = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHookTypeConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHookTypeConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookTypeConfig): CfnHookTypeConfig =
        CfnHookTypeConfig(cdkObject)

    internal fun unwrap(wrapped: CfnHookTypeConfig): software.amazon.awscdk.CfnHookTypeConfig =
        wrapped.cdkObject
  }
}

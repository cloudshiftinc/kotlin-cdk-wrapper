@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSecurityConfigProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun samlOptions(): Any? = unwrap(this).getSamlOptions()

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun samlOptions(samlOptions: IResolvable)

    public fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3b47a1112dc446a187fb14cfdd814fa4476b0948a61e41875af6250cd7fa481")
    public
        fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun samlOptions(samlOptions: IResolvable) {
      cdkBuilder.samlOptions(samlOptions.let(IResolvable::unwrap))
    }

    override fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty) {
      cdkBuilder.samlOptions(samlOptions.let(CfnSecurityConfig.SamlConfigOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3b47a1112dc446a187fb14cfdd814fa4476b0948a61e41875af6250cd7fa481")
    override
        fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty.Builder.() -> Unit):
        Unit = samlOptions(CfnSecurityConfig.SamlConfigOptionsProperty(samlOptions))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps,
  ) : CdkObject(cdkObject), CfnSecurityConfigProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun samlOptions(): Any? = unwrap(this).getSamlOptions()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps):
        CfnSecurityConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfigProps):
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps
  }
}

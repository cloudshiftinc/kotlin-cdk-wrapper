@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnPolicyStoreProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun schema(): Any? = unwrap(this).getSchema()

  public fun validationSettings(): Any

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun schema(schema: IResolvable)

    public fun schema(schema: CfnPolicyStore.SchemaDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1e2df7745e1396a73afdcbf2a815d412c1eee9b0ced71b3785a01285e267a6e")
    public fun schema(schema: CfnPolicyStore.SchemaDefinitionProperty.Builder.() -> Unit)

    public fun validationSettings(validationSettings: IResolvable)

    public fun validationSettings(validationSettings: CfnPolicyStore.ValidationSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("177ed710f3feaec137affb981a177ebf82b52c772c8a5525c6b709ff26ba8aba")
    public
        fun validationSettings(validationSettings: CfnPolicyStore.ValidationSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    override fun schema(schema: CfnPolicyStore.SchemaDefinitionProperty) {
      cdkBuilder.schema(schema.let(CfnPolicyStore.SchemaDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1e2df7745e1396a73afdcbf2a815d412c1eee9b0ced71b3785a01285e267a6e")
    override fun schema(schema: CfnPolicyStore.SchemaDefinitionProperty.Builder.() -> Unit): Unit =
        schema(CfnPolicyStore.SchemaDefinitionProperty(schema))

    override fun validationSettings(validationSettings: IResolvable) {
      cdkBuilder.validationSettings(validationSettings.let(IResolvable::unwrap))
    }

    override fun validationSettings(validationSettings: CfnPolicyStore.ValidationSettingsProperty) {
      cdkBuilder.validationSettings(validationSettings.let(CfnPolicyStore.ValidationSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("177ed710f3feaec137affb981a177ebf82b52c772c8a5525c6b709ff26ba8aba")
    override
        fun validationSettings(validationSettings: CfnPolicyStore.ValidationSettingsProperty.Builder.() -> Unit):
        Unit = validationSettings(CfnPolicyStore.ValidationSettingsProperty(validationSettings))

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps,
  ) : CdkObject(cdkObject), CfnPolicyStoreProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun schema(): Any? = unwrap(this).getSchema()

    override fun validationSettings(): Any = unwrap(this).getValidationSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps):
        CfnPolicyStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyStoreProps):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps
  }
}

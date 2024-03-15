@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

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

public open class CfnPolicyStore internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrPolicyStoreId(): String = unwrap(this).getAttrPolicyStoreId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun schema(): Any? = unwrap(this).getSchema()

  public open fun schema(`value`: IResolvable) {
    unwrap(this).setSchema(`value`.let(IResolvable::unwrap))
  }

  public open fun schema(`value`: SchemaDefinitionProperty) {
    unwrap(this).setSchema(`value`.let(SchemaDefinitionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ee191edee6e67c8fae4fbfc9c1aeaf058dcbb65cb6d5d1054d7a343fa54d703a")
  public open fun schema(`value`: SchemaDefinitionProperty.Builder.() -> Unit): Unit =
      schema(SchemaDefinitionProperty(`value`))

  public open fun validationSettings(): Any = unwrap(this).getValidationSettings()

  public open fun validationSettings(`value`: IResolvable) {
    unwrap(this).setValidationSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun validationSettings(`value`: ValidationSettingsProperty) {
    unwrap(this).setValidationSettings(`value`.let(ValidationSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca14dadee947e04776c97b90e1c4ecdb3b24528666955478fa097c805bf20fde")
  public open fun validationSettings(`value`: ValidationSettingsProperty.Builder.() -> Unit): Unit =
      validationSettings(ValidationSettingsProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun schema(schema: IResolvable)

    public fun schema(schema: SchemaDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b4c172f1184091b77bdb38cb2c4b045b34ee206d879153ed1e0c328dc12a8e4")
    public fun schema(schema: SchemaDefinitionProperty.Builder.() -> Unit)

    public fun validationSettings(validationSettings: IResolvable)

    public fun validationSettings(validationSettings: ValidationSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a939b3acbcc541a7865e358016c9d553cdf3a8bb0dfac3f3afb0c2172bcc43b3")
    public fun validationSettings(validationSettings: ValidationSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    override fun schema(schema: SchemaDefinitionProperty) {
      cdkBuilder.schema(schema.let(SchemaDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b4c172f1184091b77bdb38cb2c4b045b34ee206d879153ed1e0c328dc12a8e4")
    override fun schema(schema: SchemaDefinitionProperty.Builder.() -> Unit): Unit =
        schema(SchemaDefinitionProperty(schema))

    override fun validationSettings(validationSettings: IResolvable) {
      cdkBuilder.validationSettings(validationSettings.let(IResolvable::unwrap))
    }

    override fun validationSettings(validationSettings: ValidationSettingsProperty) {
      cdkBuilder.validationSettings(validationSettings.let(ValidationSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a939b3acbcc541a7865e358016c9d553cdf3a8bb0dfac3f3afb0c2172bcc43b3")
    override
        fun validationSettings(validationSettings: ValidationSettingsProperty.Builder.() -> Unit):
        Unit = validationSettings(ValidationSettingsProperty(validationSettings))

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicyStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicyStore(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore):
        CfnPolicyStore = CfnPolicyStore(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyStore):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore = wrapped.cdkObject
  }

  public interface ValidationSettingsProperty {
    public fun mode(): String

    @CdkDslMarker
    public interface Builder {
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.ValidationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.ValidationSettingsProperty.builder()

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.ValidationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.ValidationSettingsProperty,
    ) : CdkObject(cdkObject), ValidationSettingsProperty {
      override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ValidationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.ValidationSettingsProperty):
          ValidationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidationSettingsProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.ValidationSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.ValidationSettingsProperty
    }
  }

  public interface SchemaDefinitionProperty {
    public fun cedarJson(): String? = unwrap(this).getCedarJson()

    @CdkDslMarker
    public interface Builder {
      public fun cedarJson(cedarJson: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.SchemaDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.SchemaDefinitionProperty.builder()

      override fun cedarJson(cedarJson: String) {
        cdkBuilder.cedarJson(cedarJson)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.SchemaDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.SchemaDefinitionProperty,
    ) : CdkObject(cdkObject), SchemaDefinitionProperty {
      override fun cedarJson(): String? = unwrap(this).getCedarJson()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.SchemaDefinitionProperty):
          SchemaDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaDefinitionProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.SchemaDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.SchemaDefinitionProperty
    }
  }
}

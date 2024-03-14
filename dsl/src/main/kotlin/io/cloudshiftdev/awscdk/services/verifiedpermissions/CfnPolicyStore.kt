package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPolicyStore internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The [Amazon Resource Name
   * (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the new or
   * updated policy store.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique ID of the new or updated policy store.
   */
  public open fun attrPolicyStoreId(): String = unwrap(this).getAttrPolicyStoreId()

  /**
   * Descriptive text that you can provide to help with identification of the current policy store.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Descriptive text that you can provide to help with identification of the current policy store.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Creates or updates the policy schema in a policy store.
   */
  public open fun schema(): Any? = unwrap(this).getSchema()

  /**
   * Creates or updates the policy schema in a policy store.
   */
  public open fun schema(`value`: IResolvable) {
    unwrap(this).setSchema(`value`.let(IResolvable::unwrap))
  }

  /**
   * Creates or updates the policy schema in a policy store.
   */
  public open fun schema(`value`: SchemaDefinitionProperty) {
    unwrap(this).setSchema(`value`.let(SchemaDefinitionProperty::unwrap))
  }

  /**
   * Creates or updates the policy schema in a policy store.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ee191edee6e67c8fae4fbfc9c1aeaf058dcbb65cb6d5d1054d7a343fa54d703a")
  public open fun schema(`value`: SchemaDefinitionProperty.Builder.() -> Unit): Unit =
      schema(SchemaDefinitionProperty(`value`))

  /**
   * Specifies the validation setting for this policy store.
   */
  public open fun validationSettings(): Any = unwrap(this).getValidationSettings()

  /**
   * Specifies the validation setting for this policy store.
   */
  public open fun validationSettings(`value`: IResolvable) {
    unwrap(this).setValidationSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the validation setting for this policy store.
   */
  public open fun validationSettings(`value`: ValidationSettingsProperty) {
    unwrap(this).setValidationSettings(`value`.let(ValidationSettingsProperty::unwrap))
  }

  /**
   * Specifies the validation setting for this policy store.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca14dadee947e04776c97b90e1c4ecdb3b24528666955478fa097c805bf20fde")
  public open fun validationSettings(`value`: ValidationSettingsProperty.Builder.() -> Unit): Unit =
      validationSettings(ValidationSettingsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.verifiedpermissions.CfnPolicyStore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Descriptive text that you can provide to help with identification of the current policy
     * store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-description)
     * @param description Descriptive text that you can provide to help with identification of the
     * current policy store. 
     */
    public fun description(description: String)

    /**
     * Creates or updates the policy schema in a policy store.
     *
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-schema)
     * @param schema Creates or updates the policy schema in a policy store. 
     */
    public fun schema(schema: IResolvable)

    /**
     * Creates or updates the policy schema in a policy store.
     *
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-schema)
     * @param schema Creates or updates the policy schema in a policy store. 
     */
    public fun schema(schema: SchemaDefinitionProperty)

    /**
     * Creates or updates the policy schema in a policy store.
     *
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-schema)
     * @param schema Creates or updates the policy schema in a policy store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b4c172f1184091b77bdb38cb2c4b045b34ee206d879153ed1e0c328dc12a8e4")
    public fun schema(schema: SchemaDefinitionProperty.Builder.() -> Unit)

    /**
     * Specifies the validation setting for this policy store.
     *
     * Currently, the only valid and required value is `Mode` .
     *
     *
     * We recommend that you turn on `STRICT` mode only after you define a schema. If a schema
     * doesn't exist, then `STRICT` mode causes any policy to fail validation, and Verified Permissions
     * rejects the policy. You can turn off validation by using the
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * . Then, when you have a schema defined, use
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * again to turn validation back on.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-validationsettings)
     * @param validationSettings Specifies the validation setting for this policy store. 
     */
    public fun validationSettings(validationSettings: IResolvable)

    /**
     * Specifies the validation setting for this policy store.
     *
     * Currently, the only valid and required value is `Mode` .
     *
     *
     * We recommend that you turn on `STRICT` mode only after you define a schema. If a schema
     * doesn't exist, then `STRICT` mode causes any policy to fail validation, and Verified Permissions
     * rejects the policy. You can turn off validation by using the
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * . Then, when you have a schema defined, use
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * again to turn validation back on.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-validationsettings)
     * @param validationSettings Specifies the validation setting for this policy store. 
     */
    public fun validationSettings(validationSettings: ValidationSettingsProperty)

    /**
     * Specifies the validation setting for this policy store.
     *
     * Currently, the only valid and required value is `Mode` .
     *
     *
     * We recommend that you turn on `STRICT` mode only after you define a schema. If a schema
     * doesn't exist, then `STRICT` mode causes any policy to fail validation, and Verified Permissions
     * rejects the policy. You can turn off validation by using the
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * . Then, when you have a schema defined, use
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * again to turn validation back on.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-validationsettings)
     * @param validationSettings Specifies the validation setting for this policy store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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

    /**
     * Descriptive text that you can provide to help with identification of the current policy
     * store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-description)
     * @param description Descriptive text that you can provide to help with identification of the
     * current policy store. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Creates or updates the policy schema in a policy store.
     *
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-schema)
     * @param schema Creates or updates the policy schema in a policy store. 
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    /**
     * Creates or updates the policy schema in a policy store.
     *
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-schema)
     * @param schema Creates or updates the policy schema in a policy store. 
     */
    override fun schema(schema: SchemaDefinitionProperty) {
      cdkBuilder.schema(schema.let(SchemaDefinitionProperty::unwrap))
    }

    /**
     * Creates or updates the policy schema in a policy store.
     *
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-schema)
     * @param schema Creates or updates the policy schema in a policy store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b4c172f1184091b77bdb38cb2c4b045b34ee206d879153ed1e0c328dc12a8e4")
    override fun schema(schema: SchemaDefinitionProperty.Builder.() -> Unit): Unit =
        schema(SchemaDefinitionProperty(schema))

    /**
     * Specifies the validation setting for this policy store.
     *
     * Currently, the only valid and required value is `Mode` .
     *
     *
     * We recommend that you turn on `STRICT` mode only after you define a schema. If a schema
     * doesn't exist, then `STRICT` mode causes any policy to fail validation, and Verified Permissions
     * rejects the policy. You can turn off validation by using the
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * . Then, when you have a schema defined, use
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * again to turn validation back on.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-validationsettings)
     * @param validationSettings Specifies the validation setting for this policy store. 
     */
    override fun validationSettings(validationSettings: IResolvable) {
      cdkBuilder.validationSettings(validationSettings.let(IResolvable::unwrap))
    }

    /**
     * Specifies the validation setting for this policy store.
     *
     * Currently, the only valid and required value is `Mode` .
     *
     *
     * We recommend that you turn on `STRICT` mode only after you define a schema. If a schema
     * doesn't exist, then `STRICT` mode causes any policy to fail validation, and Verified Permissions
     * rejects the policy. You can turn off validation by using the
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * . Then, when you have a schema defined, use
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * again to turn validation back on.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-validationsettings)
     * @param validationSettings Specifies the validation setting for this policy store. 
     */
    override fun validationSettings(validationSettings: ValidationSettingsProperty) {
      cdkBuilder.validationSettings(validationSettings.let(ValidationSettingsProperty::unwrap))
    }

    /**
     * Specifies the validation setting for this policy store.
     *
     * Currently, the only valid and required value is `Mode` .
     *
     *
     * We recommend that you turn on `STRICT` mode only after you define a schema. If a schema
     * doesn't exist, then `STRICT` mode causes any policy to fail validation, and Verified Permissions
     * rejects the policy. You can turn off validation by using the
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * . Then, when you have a schema defined, use
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * again to turn validation back on.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-validationsettings)
     * @param validationSettings Specifies the validation setting for this policy store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    /**
     * The validation mode currently configured for this policy store. The valid values are:.
     *
     * * *OFF* – Neither Verified Permissions nor Cedar perform any validation on policies. No
     * validation errors are reported by either service.
     * * *STRICT* – Requires a schema to be present in the policy store. Cedar performs validation
     * on all submitted new or updated static policies and policy templates. Any that fail validation
     * are rejected and Cedar doesn't store them in the policy store.
     *
     *
     * If `Mode=STRICT` and the policy store doesn't contain a schema, Verified Permissions rejects
     * all static policies and policy templates because there is no schema to validate against.
     *
     * To submit a static policy or policy template without a schema, you must turn off validation.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policystore-validationsettings.html#cfn-verifiedpermissions-policystore-validationsettings-mode)
     */
    public fun mode(): String

    /**
     * A builder for [ValidationSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode The validation mode currently configured for this policy store. The valid
       * values are:. 
       * * *OFF* – Neither Verified Permissions nor Cedar perform any validation on policies. No
       * validation errors are reported by either service.
       * * *STRICT* – Requires a schema to be present in the policy store. Cedar performs validation
       * on all submitted new or updated static policies and policy templates. Any that fail validation
       * are rejected and Cedar doesn't store them in the policy store.
       *
       *
       * If `Mode=STRICT` and the policy store doesn't contain a schema, Verified Permissions
       * rejects all static policies and policy templates because there is no schema to validate
       * against.
       *
       * To submit a static policy or policy template without a schema, you must turn off
       * validation.
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.ValidationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.ValidationSettingsProperty.builder()

      /**
       * @param mode The validation mode currently configured for this policy store. The valid
       * values are:. 
       * * *OFF* – Neither Verified Permissions nor Cedar perform any validation on policies. No
       * validation errors are reported by either service.
       * * *STRICT* – Requires a schema to be present in the policy store. Cedar performs validation
       * on all submitted new or updated static policies and policy templates. Any that fail validation
       * are rejected and Cedar doesn't store them in the policy store.
       *
       *
       * If `Mode=STRICT` and the policy store doesn't contain a schema, Verified Permissions
       * rejects all static policies and policy templates because there is no schema to validate
       * against.
       *
       * To submit a static policy or policy template without a schema, you must turn off
       * validation.
       */
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
      /**
       * The validation mode currently configured for this policy store. The valid values are:.
       *
       * * *OFF* – Neither Verified Permissions nor Cedar perform any validation on policies. No
       * validation errors are reported by either service.
       * * *STRICT* – Requires a schema to be present in the policy store. Cedar performs validation
       * on all submitted new or updated static policies and policy templates. Any that fail validation
       * are rejected and Cedar doesn't store them in the policy store.
       *
       *
       * If `Mode=STRICT` and the policy store doesn't contain a schema, Verified Permissions
       * rejects all static policies and policy templates because there is no schema to validate
       * against.
       *
       * To submit a static policy or policy template without a schema, you must turn off
       * validation.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policystore-validationsettings.html#cfn-verifiedpermissions-policystore-validationsettings-mode)
       */
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
    /**
     * A JSON string representation of the schema supported by applications that use this policy
     * store.
     *
     * For more information, see [Policy store
     * schema](https://docs.aws.amazon.com/verifiedpermissions/latest/userguide/schema.html) in the
     * *Amazon Verified Permissions User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policystore-schemadefinition.html#cfn-verifiedpermissions-policystore-schemadefinition-cedarjson)
     */
    public fun cedarJson(): String? = unwrap(this).getCedarJson()

    /**
     * A builder for [SchemaDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cedarJson A JSON string representation of the schema supported by applications that
       * use this policy store.
       * For more information, see [Policy store
       * schema](https://docs.aws.amazon.com/verifiedpermissions/latest/userguide/schema.html) in the
       * *Amazon Verified Permissions User Guide* .
       */
      public fun cedarJson(cedarJson: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.SchemaDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore.SchemaDefinitionProperty.builder()

      /**
       * @param cedarJson A JSON string representation of the schema supported by applications that
       * use this policy store.
       * For more information, see [Policy store
       * schema](https://docs.aws.amazon.com/verifiedpermissions/latest/userguide/schema.html) in the
       * *Amazon Verified Permissions User Guide* .
       */
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
      /**
       * A JSON string representation of the schema supported by applications that use this policy
       * store.
       *
       * For more information, see [Policy store
       * schema](https://docs.aws.amazon.com/verifiedpermissions/latest/userguide/schema.html) in the
       * *Amazon Verified Permissions User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policystore-schemadefinition.html#cfn-verifiedpermissions-policystore-schemadefinition-cedarjson)
       */
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

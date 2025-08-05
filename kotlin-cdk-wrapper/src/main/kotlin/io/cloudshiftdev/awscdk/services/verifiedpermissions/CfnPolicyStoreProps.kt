@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPolicyStore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
 * CfnPolicyStoreProps cfnPolicyStoreProps = CfnPolicyStoreProps.builder()
 * .validationSettings(ValidationSettingsProperty.builder()
 * .mode("mode")
 * .build())
 * // the properties below are optional
 * .deletionProtection(DeletionProtectionProperty.builder()
 * .mode("mode")
 * .build())
 * .description("description")
 * .schema(SchemaDefinitionProperty.builder()
 * .cedarJson("cedarJson")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html)
 */
public interface CfnPolicyStoreProps {
  /**
   * Specifies whether the policy store can be deleted. If enabled, the policy store can't be
   * deleted.
   *
   * The default state is `DISABLED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-deletionprotection)
   */
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * Descriptive text that you can provide to help with identification of the current policy store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Creates or updates the policy schema in a policy store.
   *
   * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
   * policy store. Any changes to the schema validate only policies and templates submitted after the
   * schema change. Existing policies and templates are not re-evaluated against the changed schema. If
   * you later update a policy, then it is evaluated against the new schema at that time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-schema)
   */
  public fun schema(): Any? = unwrap(this).getSchema()

  /**
   * The list of key-value pairs to associate with the policy store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the validation setting for this policy store.
   *
   * Currently, the only valid and required value is `Mode` .
   *
   *
   * We recommend that you turn on `STRICT` mode only after you define a schema. If a schema doesn't
   * exist, then `STRICT` mode causes any policy to fail validation, and Verified Permissions rejects
   * the policy. You can turn off validation by using the
   * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
   * . Then, when you have a schema defined, use
   * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
   * again to turn validation back on.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-validationsettings)
   */
  public fun validationSettings(): Any

  /**
   * A builder for [CfnPolicyStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deletionProtection Specifies whether the policy store can be deleted. If enabled, the
     * policy store can't be deleted.
     * The default state is `DISABLED` .
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * @param deletionProtection Specifies whether the policy store can be deleted. If enabled, the
     * policy store can't be deleted.
     * The default state is `DISABLED` .
     */
    public fun deletionProtection(deletionProtection: CfnPolicyStore.DeletionProtectionProperty)

    /**
     * @param deletionProtection Specifies whether the policy store can be deleted. If enabled, the
     * policy store can't be deleted.
     * The default state is `DISABLED` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bac5763e1ed2e3b3831dcf0b8ab21ecba54f64862941d3fa30d54870256c2cd1")
    public
        fun deletionProtection(deletionProtection: CfnPolicyStore.DeletionProtectionProperty.Builder.() -> Unit)

    /**
     * @param description Descriptive text that you can provide to help with identification of the
     * current policy store.
     */
    public fun description(description: String)

    /**
     * @param schema Creates or updates the policy schema in a policy store.
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     */
    public fun schema(schema: IResolvable)

    /**
     * @param schema Creates or updates the policy schema in a policy store.
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     */
    public fun schema(schema: CfnPolicyStore.SchemaDefinitionProperty)

    /**
     * @param schema Creates or updates the policy schema in a policy store.
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1e2df7745e1396a73afdcbf2a815d412c1eee9b0ced71b3785a01285e267a6e")
    public fun schema(schema: CfnPolicyStore.SchemaDefinitionProperty.Builder.() -> Unit)

    /**
     * @param tags The list of key-value pairs to associate with the policy store.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of key-value pairs to associate with the policy store.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param validationSettings Specifies the validation setting for this policy store. 
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
     */
    public fun validationSettings(validationSettings: IResolvable)

    /**
     * @param validationSettings Specifies the validation setting for this policy store. 
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
     */
    public fun validationSettings(validationSettings: CfnPolicyStore.ValidationSettingsProperty)

    /**
     * @param validationSettings Specifies the validation setting for this policy store. 
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("177ed710f3feaec137affb981a177ebf82b52c772c8a5525c6b709ff26ba8aba")
    public
        fun validationSettings(validationSettings: CfnPolicyStore.ValidationSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps.builder()

    /**
     * @param deletionProtection Specifies whether the policy store can be deleted. If enabled, the
     * policy store can't be deleted.
     * The default state is `DISABLED` .
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deletionProtection Specifies whether the policy store can be deleted. If enabled, the
     * policy store can't be deleted.
     * The default state is `DISABLED` .
     */
    override fun deletionProtection(deletionProtection: CfnPolicyStore.DeletionProtectionProperty) {
      cdkBuilder.deletionProtection(deletionProtection.let(CfnPolicyStore.DeletionProtectionProperty.Companion::unwrap))
    }

    /**
     * @param deletionProtection Specifies whether the policy store can be deleted. If enabled, the
     * policy store can't be deleted.
     * The default state is `DISABLED` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bac5763e1ed2e3b3831dcf0b8ab21ecba54f64862941d3fa30d54870256c2cd1")
    override
        fun deletionProtection(deletionProtection: CfnPolicyStore.DeletionProtectionProperty.Builder.() -> Unit):
        Unit = deletionProtection(CfnPolicyStore.DeletionProtectionProperty(deletionProtection))

    /**
     * @param description Descriptive text that you can provide to help with identification of the
     * current policy store.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param schema Creates or updates the policy schema in a policy store.
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param schema Creates or updates the policy schema in a policy store.
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     */
    override fun schema(schema: CfnPolicyStore.SchemaDefinitionProperty) {
      cdkBuilder.schema(schema.let(CfnPolicyStore.SchemaDefinitionProperty.Companion::unwrap))
    }

    /**
     * @param schema Creates or updates the policy schema in a policy store.
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1e2df7745e1396a73afdcbf2a815d412c1eee9b0ced71b3785a01285e267a6e")
    override fun schema(schema: CfnPolicyStore.SchemaDefinitionProperty.Builder.() -> Unit): Unit =
        schema(CfnPolicyStore.SchemaDefinitionProperty(schema))

    /**
     * @param tags The list of key-value pairs to associate with the policy store.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The list of key-value pairs to associate with the policy store.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param validationSettings Specifies the validation setting for this policy store. 
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
     */
    override fun validationSettings(validationSettings: IResolvable) {
      cdkBuilder.validationSettings(validationSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param validationSettings Specifies the validation setting for this policy store. 
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
     */
    override fun validationSettings(validationSettings: CfnPolicyStore.ValidationSettingsProperty) {
      cdkBuilder.validationSettings(validationSettings.let(CfnPolicyStore.ValidationSettingsProperty.Companion::unwrap))
    }

    /**
     * @param validationSettings Specifies the validation setting for this policy store. 
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("177ed710f3feaec137affb981a177ebf82b52c772c8a5525c6b709ff26ba8aba")
    override
        fun validationSettings(validationSettings: CfnPolicyStore.ValidationSettingsProperty.Builder.() -> Unit):
        Unit = validationSettings(CfnPolicyStore.ValidationSettingsProperty(validationSettings))

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps,
  ) : CdkObject(cdkObject),
      CfnPolicyStoreProps {
    /**
     * Specifies whether the policy store can be deleted. If enabled, the policy store can't be
     * deleted.
     *
     * The default state is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-deletionprotection)
     */
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    /**
     * Descriptive text that you can provide to help with identification of the current policy
     * store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Creates or updates the policy schema in a policy store.
     *
     * Cedar can use the schema to validate any Cedar policies and policy templates submitted to the
     * policy store. Any changes to the schema validate only policies and templates submitted after the
     * schema change. Existing policies and templates are not re-evaluated against the changed schema.
     * If you later update a policy, then it is evaluated against the new schema at that time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-schema)
     */
    override fun schema(): Any? = unwrap(this).getSchema()

    /**
     * The list of key-value pairs to associate with the policy store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html#cfn-verifiedpermissions-policystore-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun validationSettings(): Any = unwrap(this).getValidationSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps):
        CfnPolicyStoreProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPolicyStoreProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyStoreProps):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps
  }
}

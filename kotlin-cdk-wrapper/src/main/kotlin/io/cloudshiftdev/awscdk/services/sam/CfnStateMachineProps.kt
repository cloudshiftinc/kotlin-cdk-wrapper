@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStateMachine`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * Object definition;
 * CfnStateMachineProps cfnStateMachineProps = CfnStateMachineProps.builder()
 * .definition(definition)
 * .definitionSubstitutions(Map.of(
 * "definitionSubstitutionsKey", "definitionSubstitutions"))
 * .definitionUri("definitionUri")
 * .events(Map.of(
 * "eventsKey", EventSourceProperty.builder()
 * .properties(ApiEventProperty.builder()
 * .method("method")
 * .path("path")
 * // the properties below are optional
 * .restApiId("restApiId")
 * .build())
 * .type("type")
 * .build()))
 * .logging(LoggingConfigurationProperty.builder()
 * .destinations(List.of(LogDestinationProperty.builder()
 * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .build()))
 * .includeExecutionData(false)
 * .level("level")
 * .build())
 * .name("name")
 * .permissionsBoundaries("permissionsBoundaries")
 * .policies("policies")
 * .role("role")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .tracing(TracingConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html)
 */
public interface CfnStateMachineProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definition)
   */
  public fun definition(): Any? = unwrap(this).getDefinition()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionsubstitutions)
   */
  public fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
   */
  public fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-events)
   */
  public fun events(): Any? = unwrap(this).getEvents()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
   */
  public fun logging(): Any? = unwrap(this).getLogging()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-permissionsboundaries)
   */
  public fun permissionsBoundaries(): String? = unwrap(this).getPermissionsBoundaries()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
   */
  public fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-role)
   */
  public fun role(): String? = unwrap(this).getRole()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
   */
  public fun tracing(): Any? = unwrap(this).getTracing()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnStateMachineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param definition the value to be set.
     */
    public fun definition(definition: Any)

    /**
     * @param definitionSubstitutions the value to be set.
     */
    public fun definitionSubstitutions(definitionSubstitutions: IResolvable)

    /**
     * @param definitionSubstitutions the value to be set.
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

    /**
     * @param definitionUri the value to be set.
     */
    public fun definitionUri(definitionUri: String)

    /**
     * @param definitionUri the value to be set.
     */
    public fun definitionUri(definitionUri: IResolvable)

    /**
     * @param definitionUri the value to be set.
     */
    public fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty)

    /**
     * @param definitionUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3be3d9929004f3c8f180ee6e259b6b8368f8ebca14fe1ab0cad01b113ac2afc4")
    public fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param events the value to be set.
     */
    public fun events(events: IResolvable)

    /**
     * @param events the value to be set.
     */
    public fun events(events: Map<String, Any>)

    /**
     * @param logging the value to be set.
     */
    public fun logging(logging: IResolvable)

    /**
     * @param logging the value to be set.
     */
    public fun logging(logging: CfnStateMachine.LoggingConfigurationProperty)

    /**
     * @param logging the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6519bffeda588033351817b9339bf6717ec8436a60e0e7b9aee642665a2cb88")
    public fun logging(logging: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name the value to be set.
     */
    public fun name(name: String)

    /**
     * @param permissionsBoundaries the value to be set.
     */
    public fun permissionsBoundaries(permissionsBoundaries: String)

    /**
     * @param policies the value to be set.
     */
    public fun policies(policies: String)

    /**
     * @param policies the value to be set.
     */
    public fun policies(policies: IResolvable)

    /**
     * @param policies the value to be set.
     */
    public fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty)

    /**
     * @param policies the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98b2e9acdc511c0d8aafbfdd4cd2459397cd08d033060a2dadb7393ad24121a5")
    public fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty.Builder.() -> Unit)

    /**
     * @param policies the value to be set.
     */
    public fun policies(policies: List<Any>)

    /**
     * @param policies the value to be set.
     */
    public fun policies(vararg policies: Any)

    /**
     * @param role the value to be set.
     */
    public fun role(role: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param tracing the value to be set.
     */
    public fun tracing(tracing: IResolvable)

    /**
     * @param tracing the value to be set.
     */
    public fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty)

    /**
     * @param tracing the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("479e439c6d6c54a40e605f7032d71a535fbded5ef0a6e3da0bde1f16bb57bbd8")
    public fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param type the value to be set.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnStateMachineProps.Builder =
        software.amazon.awscdk.services.sam.CfnStateMachineProps.builder()

    /**
     * @param definition the value to be set.
     */
    override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    /**
     * @param definitionSubstitutions the value to be set.
     */
    override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable::unwrap))
    }

    /**
     * @param definitionSubstitutions the value to be set.
     */
    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * @param definitionUri the value to be set.
     */
    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * @param definitionUri the value to be set.
     */
    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable::unwrap))
    }

    /**
     * @param definitionUri the value to be set.
     */
    override fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(CfnStateMachine.S3LocationProperty::unwrap))
    }

    /**
     * @param definitionUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3be3d9929004f3c8f180ee6e259b6b8368f8ebca14fe1ab0cad01b113ac2afc4")
    override
        fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty.Builder.() -> Unit):
        Unit = definitionUri(CfnStateMachine.S3LocationProperty(definitionUri))

    /**
     * @param events the value to be set.
     */
    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    /**
     * @param events the value to be set.
     */
    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    /**
     * @param logging the value to be set.
     */
    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    /**
     * @param logging the value to be set.
     */
    override fun logging(logging: CfnStateMachine.LoggingConfigurationProperty) {
      cdkBuilder.logging(logging.let(CfnStateMachine.LoggingConfigurationProperty::unwrap))
    }

    /**
     * @param logging the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6519bffeda588033351817b9339bf6717ec8436a60e0e7b9aee642665a2cb88")
    override fun logging(logging: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = logging(CfnStateMachine.LoggingConfigurationProperty(logging))

    /**
     * @param name the value to be set.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param permissionsBoundaries the value to be set.
     */
    override fun permissionsBoundaries(permissionsBoundaries: String) {
      cdkBuilder.permissionsBoundaries(permissionsBoundaries)
    }

    /**
     * @param policies the value to be set.
     */
    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    /**
     * @param policies the value to be set.
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    /**
     * @param policies the value to be set.
     */
    override fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty) {
      cdkBuilder.policies(policies.let(CfnStateMachine.IAMPolicyDocumentProperty::unwrap))
    }

    /**
     * @param policies the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98b2e9acdc511c0d8aafbfdd4cd2459397cd08d033060a2dadb7393ad24121a5")
    override fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty.Builder.() -> Unit):
        Unit = policies(CfnStateMachine.IAMPolicyDocumentProperty(policies))

    /**
     * @param policies the value to be set.
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    /**
     * @param policies the value to be set.
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    /**
     * @param role the value to be set.
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param tracing the value to be set.
     */
    override fun tracing(tracing: IResolvable) {
      cdkBuilder.tracing(tracing.let(IResolvable::unwrap))
    }

    /**
     * @param tracing the value to be set.
     */
    override fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty) {
      cdkBuilder.tracing(tracing.let(CfnStateMachine.TracingConfigurationProperty::unwrap))
    }

    /**
     * @param tracing the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("479e439c6d6c54a40e605f7032d71a535fbded5ef0a6e3da0bde1f16bb57bbd8")
    override fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty.Builder.() -> Unit):
        Unit = tracing(CfnStateMachine.TracingConfigurationProperty(tracing))

    /**
     * @param type the value to be set.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnStateMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnStateMachineProps,
  ) : CdkObject(cdkObject), CfnStateMachineProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definition)
     */
    override fun definition(): Any? = unwrap(this).getDefinition()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionsubstitutions)
     */
    override fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     */
    override fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-events)
     */
    override fun events(): Any? = unwrap(this).getEvents()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
     */
    override fun logging(): Any? = unwrap(this).getLogging()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-permissionsboundaries)
     */
    override fun permissionsBoundaries(): String? = unwrap(this).getPermissionsBoundaries()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     */
    override fun policies(): Any? = unwrap(this).getPolicies()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-role)
     */
    override fun role(): String? = unwrap(this).getRole()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
     */
    override fun tracing(): Any? = unwrap(this).getTracing()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStateMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachineProps):
        CfnStateMachineProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStateMachineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineProps):
        software.amazon.awscdk.services.sam.CfnStateMachineProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sam.CfnStateMachineProps
  }
}

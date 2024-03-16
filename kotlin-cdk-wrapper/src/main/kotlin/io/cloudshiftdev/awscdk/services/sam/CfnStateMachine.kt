@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/sam-resource-statemachine.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * Object definition;
 * CfnStateMachine cfnStateMachine = CfnStateMachine.Builder.create(this, "MyCfnStateMachine")
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
public open class CfnStateMachine internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun definition(): Any? = unwrap(this).getDefinition()

  /**
   *
   */
  public open fun definition(`value`: Any) {
    unwrap(this).setDefinition(`value`)
  }

  /**
   *
   */
  public open fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  /**
   *
   */
  public open fun definitionSubstitutions(`value`: IResolvable) {
    unwrap(this).setDefinitionSubstitutions(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun definitionSubstitutions(`value`: Map<String, String>) {
    unwrap(this).setDefinitionSubstitutions(`value`)
  }

  /**
   *
   */
  public open fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  /**
   *
   */
  public open fun definitionUri(`value`: String) {
    unwrap(this).setDefinitionUri(`value`)
  }

  /**
   *
   */
  public open fun definitionUri(`value`: IResolvable) {
    unwrap(this).setDefinitionUri(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun definitionUri(`value`: S3LocationProperty) {
    unwrap(this).setDefinitionUri(`value`.let(S3LocationProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("538bd1f27a856560c52c1fbdaa13b864fa5cf2ba25fcc07acdde72a24e402ab7")
  public open fun definitionUri(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      definitionUri(S3LocationProperty(`value`))

  /**
   *
   */
  public open fun events(): Any? = unwrap(this).getEvents()

  /**
   *
   */
  public open fun events(`value`: IResolvable) {
    unwrap(this).setEvents(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun events(`value`: Map<String, Any>) {
    unwrap(this).setEvents(`value`)
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
   *
   */
  public open fun logging(): Any? = unwrap(this).getLogging()

  /**
   *
   */
  public open fun logging(`value`: IResolvable) {
    unwrap(this).setLogging(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun logging(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLogging(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6cfa7123f6f45b2b9c3b05526b981ee87ee46e72617926629f517218c5d4eee0")
  public open fun logging(`value`: LoggingConfigurationProperty.Builder.() -> Unit): Unit =
      logging(LoggingConfigurationProperty(`value`))

  /**
   *
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun permissionsBoundaries(): String? = unwrap(this).getPermissionsBoundaries()

  /**
   *
   */
  public open fun permissionsBoundaries(`value`: String) {
    unwrap(this).setPermissionsBoundaries(`value`)
  }

  /**
   *
   */
  public open fun policies(): Any? = unwrap(this).getPolicies()

  /**
   *
   */
  public open fun policies(`value`: String) {
    unwrap(this).setPolicies(`value`)
  }

  /**
   *
   */
  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun policies(`value`: IAMPolicyDocumentProperty) {
    unwrap(this).setPolicies(`value`.let(IAMPolicyDocumentProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("76f676d0bff7ed7d4243d3eac6f0acd2f16f3ec7baf817a8e3fefd2b34d33e28")
  public open fun policies(`value`: IAMPolicyDocumentProperty.Builder.() -> Unit): Unit =
      policies(IAMPolicyDocumentProperty(`value`))

  /**
   *
   */
  public open fun policies(`value`: List<Any>) {
    unwrap(this).setPolicies(`value`)
  }

  /**
   *
   */
  public open fun policies(vararg `value`: Any): Unit = policies(`value`.toList())

  /**
   *
   */
  public open fun role(): String? = unwrap(this).getRole()

  /**
   *
   */
  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   *
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   *
   */
  public open fun tracing(): Any? = unwrap(this).getTracing()

  /**
   *
   */
  public open fun tracing(`value`: IResolvable) {
    unwrap(this).setTracing(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun tracing(`value`: TracingConfigurationProperty) {
    unwrap(this).setTracing(`value`.let(TracingConfigurationProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbd220bcedb06d13533ca9c9893e7967cd89030e550aae3263876c8a5b428bd4")
  public open fun tracing(`value`: TracingConfigurationProperty.Builder.() -> Unit): Unit =
      tracing(TracingConfigurationProperty(`value`))

  /**
   *
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   *
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sam.CfnStateMachine].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definition)
     * @param definition 
     */
    public fun definition(definition: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionsubstitutions)
     * @param definitionSubstitutions 
     */
    public fun definitionSubstitutions(definitionSubstitutions: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionsubstitutions)
     * @param definitionSubstitutions 
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: S3LocationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     * @param definitionUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a532502e4fbc84645af1b420bb905f7f1873c88666cee86d3dad2e72ac85afd")
    public fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-events)
     * @param events 
     */
    public fun events(events: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-events)
     * @param events 
     */
    public fun events(events: Map<String, Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
     * @param logging 
     */
    public fun logging(logging: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
     * @param logging 
     */
    public fun logging(logging: LoggingConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
     * @param logging 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7719052ff5353e0deff2c165a4afac2a81f5377b9e7fc7f42422d2dc1237f85")
    public fun logging(logging: LoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-permissionsboundaries)
     * @param permissionsBoundaries 
     */
    public fun permissionsBoundaries(permissionsBoundaries: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    public fun policies(policies: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    public fun policies(policies: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    public fun policies(policies: IAMPolicyDocumentProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04350778c69af704c65a0ea592c6db8970b0ce1dcd87467c70834cb71f4fb556")
    public fun policies(policies: IAMPolicyDocumentProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    public fun policies(policies: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    public fun policies(vararg policies: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-role)
     * @param role 
     */
    public fun role(role: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
     * @param tracing 
     */
    public fun tracing(tracing: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
     * @param tracing 
     */
    public fun tracing(tracing: TracingConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
     * @param tracing 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc51d5fd3e985f3caac005295a64817537cb98ccf25459eb8a7d555b77af6cd7")
    public fun tracing(tracing: TracingConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-type)
     * @param type 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnStateMachine.Builder =
        software.amazon.awscdk.services.sam.CfnStateMachine.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definition)
     * @param definition 
     */
    override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionsubstitutions)
     * @param definitionSubstitutions 
     */
    override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionsubstitutions)
     * @param definitionSubstitutions 
     */
    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(S3LocationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     * @param definitionUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a532502e4fbc84645af1b420bb905f7f1873c88666cee86d3dad2e72ac85afd")
    override fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit): Unit =
        definitionUri(S3LocationProperty(definitionUri))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-events)
     * @param events 
     */
    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-events)
     * @param events 
     */
    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
     * @param logging 
     */
    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
     * @param logging 
     */
    override fun logging(logging: LoggingConfigurationProperty) {
      cdkBuilder.logging(logging.let(LoggingConfigurationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
     * @param logging 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7719052ff5353e0deff2c165a4afac2a81f5377b9e7fc7f42422d2dc1237f85")
    override fun logging(logging: LoggingConfigurationProperty.Builder.() -> Unit): Unit =
        logging(LoggingConfigurationProperty(logging))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-permissionsboundaries)
     * @param permissionsBoundaries 
     */
    override fun permissionsBoundaries(permissionsBoundaries: String) {
      cdkBuilder.permissionsBoundaries(permissionsBoundaries)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    override fun policies(policies: IAMPolicyDocumentProperty) {
      cdkBuilder.policies(policies.let(IAMPolicyDocumentProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04350778c69af704c65a0ea592c6db8970b0ce1dcd87467c70834cb71f4fb556")
    override fun policies(policies: IAMPolicyDocumentProperty.Builder.() -> Unit): Unit =
        policies(IAMPolicyDocumentProperty(policies))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     * @param policies 
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-role)
     * @param role 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
     * @param tracing 
     */
    override fun tracing(tracing: IResolvable) {
      cdkBuilder.tracing(tracing.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
     * @param tracing 
     */
    override fun tracing(tracing: TracingConfigurationProperty) {
      cdkBuilder.tracing(tracing.let(TracingConfigurationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
     * @param tracing 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc51d5fd3e985f3caac005295a64817537cb98ccf25459eb8a7d555b77af6cd7")
    override fun tracing(tracing: TracingConfigurationProperty.Builder.() -> Unit): Unit =
        tracing(TracingConfigurationProperty(tracing))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-type)
     * @param type 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sam.CfnStateMachine.CFN_RESOURCE_TYPE_NAME

    public val REQUIRED_TRANSFORM: String =
        software.amazon.awscdk.services.sam.CfnStateMachine.REQUIRED_TRANSFORM

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStateMachine {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStateMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine):
        CfnStateMachine = CfnStateMachine(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachine):
        software.amazon.awscdk.services.sam.CfnStateMachine = wrapped.cdkObject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * StateMachineSAMPTProperty stateMachineSAMPTProperty = StateMachineSAMPTProperty.builder()
   * .stateMachineName("stateMachineName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-statemachinesampt.html)
   */
  public interface StateMachineSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-statemachinesampt.html#cfn-serverless-statemachine-statemachinesampt-statemachinename)
     */
    public fun stateMachineName(): String

    /**
     * A builder for [StateMachineSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stateMachineName the value to be set. 
       */
      public fun stateMachineName(stateMachineName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty.builder()

      /**
       * @param stateMachineName the value to be set. 
       */
      override fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty,
    ) : CdkObject(cdkObject), StateMachineSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-statemachinesampt.html#cfn-serverless-statemachine-statemachinesampt-statemachinename)
       */
      override fun stateMachineName(): String = unwrap(this).getStateMachineName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StateMachineSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty):
          StateMachineSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as StateMachineSAMPTProperty

      internal fun unwrap(wrapped: StateMachineSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object pattern;
   * EventBridgeRuleEventProperty eventBridgeRuleEventProperty =
   * EventBridgeRuleEventProperty.builder()
   * .pattern(pattern)
   * // the properties below are optional
   * .eventBusName("eventBusName")
   * .input("input")
   * .inputPath("inputPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html)
   */
  public interface EventBridgeRuleEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html#cfn-serverless-statemachine-eventbridgeruleevent-eventbusname)
     */
    public fun eventBusName(): String? = unwrap(this).getEventBusName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html#cfn-serverless-statemachine-eventbridgeruleevent-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html#cfn-serverless-statemachine-eventbridgeruleevent-inputpath)
     */
    public fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html#cfn-serverless-statemachine-eventbridgeruleevent-pattern)
     */
    public fun pattern(): Any

    /**
     * A builder for [EventBridgeRuleEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventBusName the value to be set.
       */
      public fun eventBusName(eventBusName: String)

      /**
       * @param input the value to be set.
       */
      public fun input(input: String)

      /**
       * @param inputPath the value to be set.
       */
      public fun inputPath(inputPath: String)

      /**
       * @param pattern the value to be set. 
       */
      public fun pattern(pattern: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty.builder()

      /**
       * @param eventBusName the value to be set.
       */
      override fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
      }

      /**
       * @param input the value to be set.
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param inputPath the value to be set.
       */
      override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      /**
       * @param pattern the value to be set. 
       */
      override fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty,
    ) : CdkObject(cdkObject), EventBridgeRuleEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html#cfn-serverless-statemachine-eventbridgeruleevent-eventbusname)
       */
      override fun eventBusName(): String? = unwrap(this).getEventBusName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html#cfn-serverless-statemachine-eventbridgeruleevent-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html#cfn-serverless-statemachine-eventbridgeruleevent-inputpath)
       */
      override fun inputPath(): String? = unwrap(this).getInputPath()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html#cfn-serverless-statemachine-eventbridgeruleevent-pattern)
       */
      override fun pattern(): Any = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeRuleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty):
          EventBridgeRuleEventProperty = CdkObjectWrappers.wrap(cdkObject) as
          EventBridgeRuleEventProperty

      internal fun unwrap(wrapped: EventBridgeRuleEventProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object pattern;
   * CloudWatchEventEventProperty cloudWatchEventEventProperty =
   * CloudWatchEventEventProperty.builder()
   * .pattern(pattern)
   * // the properties below are optional
   * .eventBusName("eventBusName")
   * .input("input")
   * .inputPath("inputPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html)
   */
  public interface CloudWatchEventEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html#cfn-serverless-statemachine-cloudwatcheventevent-eventbusname)
     */
    public fun eventBusName(): String? = unwrap(this).getEventBusName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html#cfn-serverless-statemachine-cloudwatcheventevent-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html#cfn-serverless-statemachine-cloudwatcheventevent-inputpath)
     */
    public fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html#cfn-serverless-statemachine-cloudwatcheventevent-pattern)
     */
    public fun pattern(): Any

    /**
     * A builder for [CloudWatchEventEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventBusName the value to be set.
       */
      public fun eventBusName(eventBusName: String)

      /**
       * @param input the value to be set.
       */
      public fun input(input: String)

      /**
       * @param inputPath the value to be set.
       */
      public fun inputPath(inputPath: String)

      /**
       * @param pattern the value to be set. 
       */
      public fun pattern(pattern: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty.builder()

      /**
       * @param eventBusName the value to be set.
       */
      override fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
      }

      /**
       * @param input the value to be set.
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param inputPath the value to be set.
       */
      override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      /**
       * @param pattern the value to be set. 
       */
      override fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty,
    ) : CdkObject(cdkObject), CloudWatchEventEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html#cfn-serverless-statemachine-cloudwatcheventevent-eventbusname)
       */
      override fun eventBusName(): String? = unwrap(this).getEventBusName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html#cfn-serverless-statemachine-cloudwatcheventevent-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html#cfn-serverless-statemachine-cloudwatcheventevent-inputpath)
       */
      override fun inputPath(): String? = unwrap(this).getInputPath()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html#cfn-serverless-statemachine-cloudwatcheventevent-pattern)
       */
      override fun pattern(): Any = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchEventEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty):
          CloudWatchEventEventProperty = CdkObjectWrappers.wrap(cdkObject) as
          CloudWatchEventEventProperty

      internal fun unwrap(wrapped: CloudWatchEventEventProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * LoggingConfigurationProperty loggingConfigurationProperty =
   * LoggingConfigurationProperty.builder()
   * .destinations(List.of(LogDestinationProperty.builder()
   * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build())
   * .build()))
   * .includeExecutionData(false)
   * .level("level")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-loggingconfiguration.html)
   */
  public interface LoggingConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-loggingconfiguration.html#cfn-serverless-statemachine-loggingconfiguration-destinations)
     */
    public fun destinations(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-loggingconfiguration.html#cfn-serverless-statemachine-loggingconfiguration-includeexecutiondata)
     */
    public fun includeExecutionData(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-loggingconfiguration.html#cfn-serverless-statemachine-loggingconfiguration-level)
     */
    public fun level(): String

    /**
     * A builder for [LoggingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinations the value to be set. 
       */
      public fun destinations(destinations: IResolvable)

      /**
       * @param destinations the value to be set. 
       */
      public fun destinations(destinations: List<Any>)

      /**
       * @param destinations the value to be set. 
       */
      public fun destinations(vararg destinations: Any)

      /**
       * @param includeExecutionData the value to be set. 
       */
      public fun includeExecutionData(includeExecutionData: Boolean)

      /**
       * @param includeExecutionData the value to be set. 
       */
      public fun includeExecutionData(includeExecutionData: IResolvable)

      /**
       * @param level the value to be set. 
       */
      public fun level(level: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty.builder()

      /**
       * @param destinations the value to be set. 
       */
      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      /**
       * @param destinations the value to be set. 
       */
      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations)
      }

      /**
       * @param destinations the value to be set. 
       */
      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      /**
       * @param includeExecutionData the value to be set. 
       */
      override fun includeExecutionData(includeExecutionData: Boolean) {
        cdkBuilder.includeExecutionData(includeExecutionData)
      }

      /**
       * @param includeExecutionData the value to be set. 
       */
      override fun includeExecutionData(includeExecutionData: IResolvable) {
        cdkBuilder.includeExecutionData(includeExecutionData.let(IResolvable::unwrap))
      }

      /**
       * @param level the value to be set. 
       */
      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty,
    ) : CdkObject(cdkObject), LoggingConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-loggingconfiguration.html#cfn-serverless-statemachine-loggingconfiguration-destinations)
       */
      override fun destinations(): Any = unwrap(this).getDestinations()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-loggingconfiguration.html#cfn-serverless-statemachine-loggingconfiguration-includeexecutiondata)
       */
      override fun includeExecutionData(): Any = unwrap(this).getIncludeExecutionData()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-loggingconfiguration.html#cfn-serverless-statemachine-loggingconfiguration-level)
       */
      override fun level(): String = unwrap(this).getLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty):
          LoggingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          LoggingConfigurationProperty

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .version(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-s3location.html#cfn-serverless-statemachine-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-s3location.html#cfn-serverless-statemachine-s3location-key)
     */
    public fun key(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-s3location.html#cfn-serverless-statemachine-s3location-version)
     */
    public fun version(): Number? = unwrap(this).getVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket the value to be set. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key the value to be set. 
       */
      public fun key(key: String)

      /**
       * @param version the value to be set.
       */
      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty.builder()

      /**
       * @param bucket the value to be set. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key the value to be set. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version the value to be set.
       */
      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-s3location.html#cfn-serverless-statemachine-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-s3location.html#cfn-serverless-statemachine-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-s3location.html#cfn-serverless-statemachine-s3location-version)
       */
      override fun version(): Number? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as S3LocationProperty

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * LogDestinationProperty logDestinationProperty = LogDestinationProperty.builder()
   * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-logdestination.html)
   */
  public interface LogDestinationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-logdestination.html#cfn-serverless-statemachine-logdestination-cloudwatchlogsloggroup)
     */
    public fun cloudWatchLogsLogGroup(): Any

    /**
     * A builder for [LogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsLogGroup the value to be set. 
       */
      public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable)

      /**
       * @param cloudWatchLogsLogGroup the value to be set. 
       */
      public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty)

      /**
       * @param cloudWatchLogsLogGroup the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ac7753aad5c0b8baf4a728c093bbd62ef4d34db391fc69a6b081de72c8a4f85")
      public
          fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty.builder()

      /**
       * @param cloudWatchLogsLogGroup the value to be set. 
       */
      override fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogsLogGroup the value to be set. 
       */
      override fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup.let(CloudWatchLogsLogGroupProperty::unwrap))
      }

      /**
       * @param cloudWatchLogsLogGroup the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ac7753aad5c0b8baf4a728c093bbd62ef4d34db391fc69a6b081de72c8a4f85")
      override
          fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty.Builder.() -> Unit):
          Unit = cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty(cloudWatchLogsLogGroup))

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty,
    ) : CdkObject(cdkObject), LogDestinationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-logdestination.html#cfn-serverless-statemachine-logdestination-cloudwatchlogsloggroup)
       */
      override fun cloudWatchLogsLogGroup(): Any = unwrap(this).getCloudWatchLogsLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty):
          LogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as LogDestinationProperty

      internal fun unwrap(wrapped: LogDestinationProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * FunctionSAMPTProperty functionSAMPTProperty = FunctionSAMPTProperty.builder()
   * .functionName("functionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-functionsampt.html)
   */
  public interface FunctionSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-functionsampt.html#cfn-serverless-statemachine-functionsampt-functionname)
     */
    public fun functionName(): String

    /**
     * A builder for [FunctionSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionName the value to be set. 
       */
      public fun functionName(functionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty.builder()

      /**
       * @param functionName the value to be set. 
       */
      override fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty,
    ) : CdkObject(cdkObject), FunctionSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-functionsampt.html#cfn-serverless-statemachine-functionsampt-functionname)
       */
      override fun functionName(): String = unwrap(this).getFunctionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty):
          FunctionSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as FunctionSAMPTProperty

      internal fun unwrap(wrapped: FunctionSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * SAMPolicyTemplateProperty sAMPolicyTemplateProperty = SAMPolicyTemplateProperty.builder()
   * .lambdaInvokePolicy(FunctionSAMPTProperty.builder()
   * .functionName("functionName")
   * .build())
   * .stepFunctionsExecutionPolicy(StateMachineSAMPTProperty.builder()
   * .stateMachineName("stateMachineName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-sampolicytemplate.html)
   */
  public interface SAMPolicyTemplateProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-sampolicytemplate.html#cfn-serverless-statemachine-sampolicytemplate-lambdainvokepolicy)
     */
    public fun lambdaInvokePolicy(): Any? = unwrap(this).getLambdaInvokePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-sampolicytemplate.html#cfn-serverless-statemachine-sampolicytemplate-stepfunctionsexecutionpolicy)
     */
    public fun stepFunctionsExecutionPolicy(): Any? = unwrap(this).getStepFunctionsExecutionPolicy()

    /**
     * A builder for [SAMPolicyTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      public fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable)

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      public fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty)

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f529e6ecbe7d5aeaaa28c4384f2b4b9f68b2a390c9fd1df10d5e7254aaa7c4e")
      public fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty.Builder.() -> Unit)

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable)

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      public
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty)

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55aab9b20aeefe7e5d5552a6e39b132f58bd2eabc422d596e90a12a5cef6acd6")
      public
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty.builder()

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      override fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      override fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy.let(FunctionSAMPTProperty::unwrap))
      }

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f529e6ecbe7d5aeaaa28c4384f2b4b9f68b2a390c9fd1df10d5e7254aaa7c4e")
      override fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty.Builder.() -> Unit):
          Unit = lambdaInvokePolicy(FunctionSAMPTProperty(lambdaInvokePolicy))

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      override fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      override
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.let(StateMachineSAMPTProperty::unwrap))
      }

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55aab9b20aeefe7e5d5552a6e39b132f58bd2eabc422d596e90a12a5cef6acd6")
      override
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty.Builder.() -> Unit):
          Unit =
          stepFunctionsExecutionPolicy(StateMachineSAMPTProperty(stepFunctionsExecutionPolicy))

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty,
    ) : CdkObject(cdkObject), SAMPolicyTemplateProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-sampolicytemplate.html#cfn-serverless-statemachine-sampolicytemplate-lambdainvokepolicy)
       */
      override fun lambdaInvokePolicy(): Any? = unwrap(this).getLambdaInvokePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-sampolicytemplate.html#cfn-serverless-statemachine-sampolicytemplate-stepfunctionsexecutionpolicy)
       */
      override fun stepFunctionsExecutionPolicy(): Any? =
          unwrap(this).getStepFunctionsExecutionPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SAMPolicyTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty):
          SAMPolicyTemplateProperty = CdkObjectWrappers.wrap(cdkObject) as SAMPolicyTemplateProperty

      internal fun unwrap(wrapped: SAMPolicyTemplateProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * ScheduleEventProperty scheduleEventProperty = ScheduleEventProperty.builder()
   * .schedule("schedule")
   * // the properties below are optional
   * .input("input")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-scheduleevent.html)
   */
  public interface ScheduleEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-scheduleevent.html#cfn-serverless-statemachine-scheduleevent-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-scheduleevent.html#cfn-serverless-statemachine-scheduleevent-schedule)
     */
    public fun schedule(): String

    /**
     * A builder for [ScheduleEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param input the value to be set.
       */
      public fun input(input: String)

      /**
       * @param schedule the value to be set. 
       */
      public fun schedule(schedule: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty.builder()

      /**
       * @param input the value to be set.
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param schedule the value to be set. 
       */
      override fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty,
    ) : CdkObject(cdkObject), ScheduleEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-scheduleevent.html#cfn-serverless-statemachine-scheduleevent-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-scheduleevent.html#cfn-serverless-statemachine-scheduleevent-schedule)
       */
      override fun schedule(): String = unwrap(this).getSchedule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty):
          ScheduleEventProperty = CdkObjectWrappers.wrap(cdkObject) as ScheduleEventProperty

      internal fun unwrap(wrapped: ScheduleEventProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * CloudWatchLogsLogGroupProperty cloudWatchLogsLogGroupProperty =
   * CloudWatchLogsLogGroupProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatchlogsloggroup.html)
   */
  public interface CloudWatchLogsLogGroupProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatchlogsloggroup.html#cfn-serverless-statemachine-cloudwatchlogsloggroup-loggrouparn)
     */
    public fun logGroupArn(): String

    /**
     * A builder for [CloudWatchLogsLogGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupArn the value to be set. 
       */
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder
          =
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty.builder()

      /**
       * @param logGroupArn the value to be set. 
       */
      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsLogGroupProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatchlogsloggroup.html#cfn-serverless-statemachine-cloudwatchlogsloggroup-loggrouparn)
       */
      override fun logGroupArn(): String = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsLogGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty):
          CloudWatchLogsLogGroupProperty = CdkObjectWrappers.wrap(cdkObject) as
          CloudWatchLogsLogGroupProperty

      internal fun unwrap(wrapped: CloudWatchLogsLogGroupProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * TracingConfigurationProperty tracingConfigurationProperty =
   * TracingConfigurationProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-tracingconfiguration.html)
   */
  public interface TracingConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-tracingconfiguration.html#cfn-serverless-statemachine-tracingconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [TracingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty.builder()

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty,
    ) : CdkObject(cdkObject), TracingConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-tracingconfiguration.html#cfn-serverless-statemachine-tracingconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TracingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty):
          TracingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          TracingConfigurationProperty

      internal fun unwrap(wrapped: TracingConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * EventSourceProperty eventSourceProperty = EventSourceProperty.builder()
   * .properties(ApiEventProperty.builder()
   * .method("method")
   * .path("path")
   * // the properties below are optional
   * .restApiId("restApiId")
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventsource.html)
   */
  public interface EventSourceProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventsource.html#cfn-serverless-statemachine-eventsource-properties)
     */
    public fun properties(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventsource.html#cfn-serverless-statemachine-eventsource-type)
     */
    public fun type(): String

    /**
     * A builder for [EventSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: ApiEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40e79479ca1fe3df64b7aafeedb6c40fa3d2d53993be4ba2a5d1daec72831ea1")
      public fun properties(properties: ApiEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: CloudWatchEventEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e05cbdb421d6a3f300c28f5c4d41a4bb4a147ef563c23289793f11c465fa3b0")
      public fun properties(properties: CloudWatchEventEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: EventBridgeRuleEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33a29f15107863a2f15d8a7b6575885d8bc6f17fd60f76e71047c3b115623532")
      public fun properties(properties: EventBridgeRuleEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: ScheduleEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea07d398ece309f929e477bdd3715abb5bb855bb108e225dc59923fd888dca52")
      public fun properties(properties: ScheduleEventProperty.Builder.() -> Unit)

      /**
       * @param type the value to be set. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty.builder()

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: ApiEventProperty) {
        cdkBuilder.properties(properties.let(ApiEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40e79479ca1fe3df64b7aafeedb6c40fa3d2d53993be4ba2a5d1daec72831ea1")
      override fun properties(properties: ApiEventProperty.Builder.() -> Unit): Unit =
          properties(ApiEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: CloudWatchEventEventProperty) {
        cdkBuilder.properties(properties.let(CloudWatchEventEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e05cbdb421d6a3f300c28f5c4d41a4bb4a147ef563c23289793f11c465fa3b0")
      override fun properties(properties: CloudWatchEventEventProperty.Builder.() -> Unit): Unit =
          properties(CloudWatchEventEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: EventBridgeRuleEventProperty) {
        cdkBuilder.properties(properties.let(EventBridgeRuleEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33a29f15107863a2f15d8a7b6575885d8bc6f17fd60f76e71047c3b115623532")
      override fun properties(properties: EventBridgeRuleEventProperty.Builder.() -> Unit): Unit =
          properties(EventBridgeRuleEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: ScheduleEventProperty) {
        cdkBuilder.properties(properties.let(ScheduleEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea07d398ece309f929e477bdd3715abb5bb855bb108e225dc59923fd888dca52")
      override fun properties(properties: ScheduleEventProperty.Builder.() -> Unit): Unit =
          properties(ScheduleEventProperty(properties))

      /**
       * @param type the value to be set. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty,
    ) : CdkObject(cdkObject), EventSourceProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventsource.html#cfn-serverless-statemachine-eventsource-properties)
       */
      override fun properties(): Any = unwrap(this).getProperties()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventsource.html#cfn-serverless-statemachine-eventsource-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty):
          EventSourceProperty = CdkObjectWrappers.wrap(cdkObject) as EventSourceProperty

      internal fun unwrap(wrapped: EventSourceProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object statement;
   * IAMPolicyDocumentProperty iAMPolicyDocumentProperty = Map.of(
   * "statement", statement,
   * "version", "version");
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-iampolicydocument.html)
   */
  public interface IAMPolicyDocumentProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-iampolicydocument.html#cfn-serverless-statemachine-iampolicydocument-statement)
     */
    public fun statement(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-iampolicydocument.html#cfn-serverless-statemachine-iampolicydocument-version)
     */
    public fun version(): String

    /**
     * A builder for [IAMPolicyDocumentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statement the value to be set. 
       */
      public fun statement(statement: Any)

      /**
       * @param version the value to be set. 
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty.builder()

      /**
       * @param statement the value to be set. 
       */
      override fun statement(statement: Any) {
        cdkBuilder.statement(statement)
      }

      /**
       * @param version the value to be set. 
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty,
    ) : CdkObject(cdkObject), IAMPolicyDocumentProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-iampolicydocument.html#cfn-serverless-statemachine-iampolicydocument-statement)
       */
      override fun statement(): Any = unwrap(this).getStatement()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-iampolicydocument.html#cfn-serverless-statemachine-iampolicydocument-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IAMPolicyDocumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty):
          IAMPolicyDocumentProperty = CdkObjectWrappers.wrap(cdkObject) as IAMPolicyDocumentProperty

      internal fun unwrap(wrapped: IAMPolicyDocumentProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * ApiEventProperty apiEventProperty = ApiEventProperty.builder()
   * .method("method")
   * .path("path")
   * // the properties below are optional
   * .restApiId("restApiId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-apievent.html)
   */
  public interface ApiEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-apievent.html#cfn-serverless-statemachine-apievent-method)
     */
    public fun method(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-apievent.html#cfn-serverless-statemachine-apievent-path)
     */
    public fun path(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-apievent.html#cfn-serverless-statemachine-apievent-restapiid)
     */
    public fun restApiId(): String? = unwrap(this).getRestApiId()

    /**
     * A builder for [ApiEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param method the value to be set. 
       */
      public fun method(method: String)

      /**
       * @param path the value to be set. 
       */
      public fun path(path: String)

      /**
       * @param restApiId the value to be set.
       */
      public fun restApiId(restApiId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty.builder()

      /**
       * @param method the value to be set. 
       */
      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      /**
       * @param path the value to be set. 
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param restApiId the value to be set.
       */
      override fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty,
    ) : CdkObject(cdkObject), ApiEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-apievent.html#cfn-serverless-statemachine-apievent-method)
       */
      override fun method(): String = unwrap(this).getMethod()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-apievent.html#cfn-serverless-statemachine-apievent-path)
       */
      override fun path(): String = unwrap(this).getPath()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-apievent.html#cfn-serverless-statemachine-apievent-restapiid)
       */
      override fun restApiId(): String? = unwrap(this).getRestApiId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty):
          ApiEventProperty = CdkObjectWrappers.wrap(cdkObject) as ApiEventProperty

      internal fun unwrap(wrapped: ApiEventProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty
    }
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a CloudFormation resource.
 *
 * Example:
 *
 * ```
 * public class MyConstruct extends Resource implements ITaggable {
 * public final Object tags;
 * public MyConstruct(Construct scope, String id) {
 * super(scope, id);
 * CfnResource.Builder.create(this, "Resource")
 * .type("Whatever::The::Type")
 * .properties(Map.of(
 * // ...
 * "Tags", this.tags.getRenderedTags()))
 * .build();
 * }
 * }
 * ```
 */
public open class CfnResource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnResource,
) : CfnRefElement(cdkObject) {
  /**
   * Syntactic sugar for `addOverride(path, undefined)`.
   *
   * @param path The path of the value to delete. 
   */
  public open fun addDeletionOverride(path: String) {
    unwrap(this).addDeletionOverride(path)
  }

  /**
   * Indicates that this resource depends on another resource and cannot be provisioned unless the
   * other resource has been successfully provisioned.
   *
   * This can be used for resources across stacks (or nested stack) boundaries
   * and the dependency will automatically be transferred to the relevant scope.
   *
   * @param target 
   */
  public open fun addDependency(target: CfnResource) {
    unwrap(this).addDependency(target.let(CfnResource::unwrap))
  }

  /**
   * (deprecated) Indicates that this resource depends on another resource and cannot be provisioned
   * unless the other resource has been successfully provisioned.
   *
   * @deprecated use addDependency
   * @param target 
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun addDependsOn(target: CfnResource) {
    unwrap(this).addDependsOn(target.let(CfnResource::unwrap))
  }

  /**
   * Add a value to the CloudFormation Resource Metadata.
   *
   * @see <a
   * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/metadata-section-structure.html
   * Note that this is a different set of metadata from CDK node metadata; this
   * metadata ends up in the stack template under the resource, whereas CDK
   * node metadata ends up in the Cloud
   * Assembly.">https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/metadata-section-structure.html
   * Note that this is a different set of metadata from CDK node metadata; this
   * metadata ends up in the stack template under the resource, whereas CDK
   * node metadata ends up in the Cloud Assembly.</a>
   * @param key 
   * @param value 
   */
  public open fun addMetadata(key: String, `value`: Any) {
    unwrap(this).addMetadata(key, `value`)
  }

  /**
   * Adds an override to the synthesized CloudFormation resource.
   *
   * To add a
   * property override, either use `addPropertyOverride` or prefix `path` with
   * "Properties." (i.e. `Properties.TopicName`).
   *
   * If the override is nested, separate each nested level using a dot (.) in the path parameter.
   * If there is an array as part of the nesting, specify the index in the path.
   *
   * To include a literal `.` in the property name, prefix with a `\`. In most
   * programming languages you will need to write this as `"\\."` because the
   * `\` itself will need to be escaped.
   *
   * For example,
   *
   * ```
   * cfnResource.addOverride("Properties.GlobalSecondaryIndexes.0.Projection.NonKeyAttributes",
   * List.of("myattribute"));
   * cfnResource.addOverride("Properties.GlobalSecondaryIndexes.1.ProjectionType", "INCLUDE");
   * ```
   *
   * would add the overrides
   *
   * ```
   * "Properties": {
   * "GlobalSecondaryIndexes": [
   * {
   * "Projection": {
   * "NonKeyAttributes": [ "myattribute" ]
   * ...
   * }
   * ...
   * },
   * {
   * "ProjectionType": "INCLUDE"
   * ...
   * },
   * ]
   * ...
   * }
   * ```
   *
   * The `value` argument to `addOverride` will not be processed or translated
   * in any way. Pass raw JSON values in here with the correct capitalization
   * for CloudFormation. If you pass CDK classes or structs, they will be
   * rendered with lowercased key names, and CloudFormation will reject the
   * template.
   *
   * @param path * The path of the property, you can use dot notation to override values in complex
   * types. 
   * @param value * The value. 
   */
  public open fun addOverride(path: String, `value`: Any) {
    unwrap(this).addOverride(path, `value`)
  }

  /**
   * Adds an override that deletes the value of a property from the resource definition.
   *
   * @param propertyPath The path to the property. 
   */
  public open fun addPropertyDeletionOverride(propertyPath: String) {
    unwrap(this).addPropertyDeletionOverride(propertyPath)
  }

  /**
   * Adds an override to a resource property.
   *
   * Syntactic sugar for `addOverride("Properties.&lt;...&gt;", value)`.
   *
   * @param propertyPath The path of the property. 
   * @param value The value. 
   */
  public open fun addPropertyOverride(propertyPath: String, `value`: Any) {
    unwrap(this).addPropertyOverride(propertyPath, `value`)
  }

  /**
   * Sets the deletion policy of the resource based on the removal policy specified.
   *
   * The Removal Policy controls what happens to this resource when it stops
   * being managed by CloudFormation, either because you've removed it from the
   * CDK application or because you've made a change that requires the resource
   * to be replaced.
   *
   * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
   * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`). In some
   * cases, a snapshot can be taken of the resource prior to deletion
   * (`RemovalPolicy.SNAPSHOT`). A list of resources that support this policy
   * can be found in the following link:
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html#aws-attribute-deletionpolicy-options)
   * @param policy
   * @param options
   */
  public open fun applyRemovalPolicy() {
    unwrap(this).applyRemovalPolicy()
  }

  /**
   * Sets the deletion policy of the resource based on the removal policy specified.
   *
   * The Removal Policy controls what happens to this resource when it stops
   * being managed by CloudFormation, either because you've removed it from the
   * CDK application or because you've made a change that requires the resource
   * to be replaced.
   *
   * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
   * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`). In some
   * cases, a snapshot can be taken of the resource prior to deletion
   * (`RemovalPolicy.SNAPSHOT`). A list of resources that support this policy
   * can be found in the following link:
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html#aws-attribute-deletionpolicy-options)
   * @param policy
   * @param options
   */
  public open fun applyRemovalPolicy(policy: RemovalPolicy) {
    unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
  }

  /**
   * Sets the deletion policy of the resource based on the removal policy specified.
   *
   * The Removal Policy controls what happens to this resource when it stops
   * being managed by CloudFormation, either because you've removed it from the
   * CDK application or because you've made a change that requires the resource
   * to be replaced.
   *
   * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
   * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`). In some
   * cases, a snapshot can be taken of the resource prior to deletion
   * (`RemovalPolicy.SNAPSHOT`). A list of resources that support this policy
   * can be found in the following link:
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html#aws-attribute-deletionpolicy-options)
   * @param policy
   * @param options
   */
  public open fun applyRemovalPolicy(policy: RemovalPolicy, options: RemovalPolicyOptions) {
    unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap),
        options.let(RemovalPolicyOptions::unwrap))
  }

  /**
   * Sets the deletion policy of the resource based on the removal policy specified.
   *
   * The Removal Policy controls what happens to this resource when it stops
   * being managed by CloudFormation, either because you've removed it from the
   * CDK application or because you've made a change that requires the resource
   * to be replaced.
   *
   * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
   * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`). In some
   * cases, a snapshot can be taken of the resource prior to deletion
   * (`RemovalPolicy.SNAPSHOT`). A list of resources that support this policy
   * can be found in the following link:
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html#aws-attribute-deletionpolicy-options)
   * @param policy
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a90918962feaeaebb71ba6d5cbff48f97056e79d196c85769b869dee2cf0abcb")
  public open fun applyRemovalPolicy(policy: RemovalPolicy,
      options: RemovalPolicyOptions.Builder.() -> Unit): Unit = applyRemovalPolicy(policy,
      RemovalPolicyOptions(options))

  /**
   * Returns a token for an runtime attribute of this resource.
   *
   * Ideally, use generated attribute accessors (e.g. `resource.arn`), but this can be used for
   * future compatibility
   * in case there is no generated attribute.
   *
   * @param attributeName The name of the attribute. 
   * @param typeHint
   */
  public open fun att(attributeName: String): Reference =
      unwrap(this).getAtt(attributeName).let(Reference::wrap)

  /**
   * Returns a token for an runtime attribute of this resource.
   *
   * Ideally, use generated attribute accessors (e.g. `resource.arn`), but this can be used for
   * future compatibility
   * in case there is no generated attribute.
   *
   * @param attributeName The name of the attribute. 
   * @param typeHint
   */
  public open fun att(attributeName: String, typeHint: ResolutionTypeHint): Reference =
      unwrap(this).getAtt(attributeName,
      typeHint.let(ResolutionTypeHint::unwrap)).let(Reference::wrap)

  /**
   * Options for this resource, such as condition, update policy etc.
   */
  public open fun cfnOptions(): ICfnResourceOptions =
      unwrap(this).getCfnOptions().let(ICfnResourceOptions::wrap)

  /**
   * AWS resource type.
   */
  public open fun cfnResourceType(): String = unwrap(this).getCfnResourceType()

  /**
   * Retrieve a value value from the CloudFormation Resource Metadata.
   *
   * @see <a
   * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/metadata-section-structure.html
   * Note that this is a different set of metadata from CDK node metadata; this
   * metadata ends up in the stack template under the resource, whereas CDK
   * node metadata ends up in the Cloud
   * Assembly.">https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/metadata-section-structure.html
   * Note that this is a different set of metadata from CDK node metadata; this
   * metadata ends up in the stack template under the resource, whereas CDK
   * node metadata ends up in the Cloud Assembly.</a>
   * @param key 
   */
  public open fun metadata(key: String): Any = unwrap(this).getMetadata(key)

  /**
   * Retrieves an array of resources this resource depends on.
   *
   * This assembles dependencies on resources across stacks (including nested stacks)
   * automatically.
   */
  public open fun obtainDependencies(): List<Any> = unwrap(this).obtainDependencies()

  /**
   * Get a shallow copy of dependencies between this resource and other resources in the same stack.
   */
  public open fun obtainResourceDependencies(): List<CfnResource> =
      unwrap(this).obtainResourceDependencies().map(CfnResource::wrap)

  /**
   * Indicates that this resource no longer depends on another resource.
   *
   * This can be used for resources across stacks (including nested stacks)
   * and the dependency will automatically be removed from the relevant scope.
   *
   * @param target 
   */
  public open fun removeDependency(target: CfnResource) {
    unwrap(this).removeDependency(target.let(CfnResource::unwrap))
  }

  /**
   * Replaces one dependency with another.
   *
   * @param target The dependency to replace. 
   * @param newTarget The new dependency to add. 
   */
  public open fun replaceDependency(target: CfnResource, newTarget: CfnResource) {
    unwrap(this).replaceDependency(target.let(CfnResource::unwrap),
        newTarget.let(CfnResource::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnResource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Resource properties.
     *
     * Default: - No resource properties.
     *
     * @param properties Resource properties. 
     */
    public fun properties(properties: Map<String, Any>)

    /**
     * CloudFormation resource type (e.g. `AWS::S3::Bucket`).
     *
     * @param type CloudFormation resource type (e.g. `AWS::S3::Bucket`). 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnResource.Builder =
        software.amazon.awscdk.CfnResource.Builder.create(scope, id)

    /**
     * Resource properties.
     *
     * Default: - No resource properties.
     *
     * @param properties Resource properties. 
     */
    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    /**
     * CloudFormation resource type (e.g. `AWS::S3::Bucket`).
     *
     * @param type CloudFormation resource type (e.g. `AWS::S3::Bucket`). 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnResource = cdkBuilder.build()
  }

  public companion object {
    public fun isCfnResource(x: Any): Boolean = software.amazon.awscdk.CfnResource.isCfnResource(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnResource): CfnResource =
        CfnResource(cdkObject)

    internal fun unwrap(wrapped: CfnResource): software.amazon.awscdk.CfnResource =
        wrapped.cdkObject
  }
}

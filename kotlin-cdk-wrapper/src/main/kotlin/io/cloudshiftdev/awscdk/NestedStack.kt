@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CloudFormation nested stack.
 *
 * When you apply template changes to update a top-level stack, CloudFormation
 * updates the top-level stack and initiates an update to its nested stacks.
 * CloudFormation updates the resources of modified nested stacks, but does not
 * update the resources of unmodified nested stacks.
 *
 * Furthermore, this stack will not be treated as an independent deployment
 * artifact (won't be listed in "cdk list" or deployable through "cdk deploy"),
 * but rather only synthesized as a template and uploaded as an asset to S3.
 *
 * Cross references of resource attributes between the parent stack and the
 * nested stack will automatically be translated to stack parameters and
 * outputs.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.customresources.CustomResourceConfig;
 * import io.cloudshiftdev.awscdk.services.s3.deployment.*;
 * App app = new App();
 * Stack stack = new Stack(app, "Stack");
 * CustomResourceConfig.of(app).addLogRetentionLifetime(RetentionDays.TEN_YEARS);
 * NestedStack nestedStackA = new NestedStack(stack, "NestedStackA");
 * Bucket websiteBucketA = Bucket.Builder.create(nestedStackA, "WebsiteBucketA").build();
 * BucketDeployment.Builder.create(nestedStackA, "s3deployA")
 * .sources(List.of(Source.jsonData("file.json", Map.of("a", "b"))))
 * .destinationBucket(websiteBucketA)
 * .logRetention(RetentionDays.ONE_DAY)
 * .build();
 * NestedStack nestedStackB = new NestedStack(stack, "NestedStackB");
 * Bucket websiteBucketB = Bucket.Builder.create(nestedStackB, "WebsiteBucketB").build();
 * BucketDeployment.Builder.create(nestedStackB, "s3deployB")
 * .sources(List.of(Source.jsonData("file.json", Map.of("a", "b"))))
 * .destinationBucket(websiteBucketB)
 * .logRetention(RetentionDays.ONE_DAY)
 * .build();
 * ```
 */
public open class NestedStack(
  cdkObject: software.amazon.awscdk.NestedStack,
) : Stack(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.NestedStack(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NestedStackProps,
  ) :
      this(software.amazon.awscdk.NestedStack(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(NestedStackProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NestedStackProps.Builder.() -> Unit,
  ) : this(scope, id, NestedStackProps(props)
  )

  /**
   * If this is a nested stack, this represents its `AWS::CloudFormation::Stack` resource.
   *
   * `undefined` for top-level (non-nested) stacks.
   */
  public override fun nestedStackResource(): CfnResource? =
      unwrap(this).getNestedStackResource()?.let(CfnResource::wrap)

  /**
   * Assign a value to one of the nested stack parameters.
   *
   * @param name The parameter name (ID). 
   * @param value The value to assign. 
   */
  public open fun parameter(name: String, `value`: String) {
    unwrap(this).setParameter(name, `value`)
  }

  /**
   * An attribute that represents the ID of the stack.
   *
   * This is a context aware attribute:
   *
   * * If this is referenced from the parent stack, it will return `{ "Ref":
   * "LogicalIdOfNestedStackResource" }`.
   * * If this is referenced from the context of the nested stack, it will return `{ "Ref":
   * "AWS::StackId" }`
   *
   * Example value:
   * `arn:aws:cloudformation:us-east-2:123456789012:stack/mystack-mynestedstack-sggfrhxhum7w/f449b250-b969-11e0-a185-5081d0136786`
   */
  public override fun stackId(): String = unwrap(this).getStackId()

  /**
   * An attribute that represents the name of the nested stack.
   *
   * This is a context aware attribute:
   *
   * * If this is referenced from the parent stack, it will return a token that parses the name from
   * the stack ID.
   * * If this is referenced from the context of the nested stack, it will return `{ "Ref":
   * "AWS::StackName" }`
   *
   * Example value: `mystack-mynestedstack-sggfrhxhum7w`
   */
  public override fun stackName(): String = unwrap(this).getStackName()

  /**
   * The name of the CloudFormation template file emitted to the output directory during synthesis.
   *
   * Example value: `MyStack.template.json`
   */
  public override fun templateFile(): String = unwrap(this).getTemplateFile()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.NestedStack].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the stack.
     *
     * Default: - No description.
     *
     * @param description A description of the stack. 
     */
    public fun description(description: String)

    /**
     * The Simple Notification Service (SNS) topics to publish stack related events.
     *
     * Default: - notifications are not sent for this stack.
     *
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     * events. 
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * The Simple Notification Service (SNS) topics to publish stack related events.
     *
     * Default: - notifications are not sent for this stack.
     *
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     * events. 
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding
     * to a parameter defined in the embedded template and a value representing
     * the value that you want to set for the parameter.
     *
     * The nested stack construct will automatically synthesize parameters in order
     * to bind references from the parent stack(s) into the nested stack.
     *
     * Default: - no user-defined parameters are passed to the nested stack
     *
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created. 
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * Policy to apply when the nested stack is removed.
     *
     * The default is `Destroy`, because all Removal Policies of resources inside the
     * Nested Stack should already have been set correctly. You normally should
     * not need to set this value.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy Policy to apply when the nested stack is removed. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The length of time that CloudFormation waits for the nested stack to reach the
     * CREATE_COMPLETE state.
     *
     * When CloudFormation detects that the nested stack has reached the
     * CREATE_COMPLETE state, it marks the nested stack resource as
     * CREATE_COMPLETE in the parent stack and resumes creating the parent stack.
     * If the timeout period expires before the nested stack reaches
     * CREATE_COMPLETE, CloudFormation marks the nested stack as failed and rolls
     * back both the nested stack and parent stack.
     *
     * Default: - no timeout
     *
     * @param timeout The length of time that CloudFormation waits for the nested stack to reach the
     * CREATE_COMPLETE state. 
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.NestedStack.Builder =
        software.amazon.awscdk.NestedStack.Builder.create(scope, id)

    /**
     * A description of the stack.
     *
     * Default: - No description.
     *
     * @param description A description of the stack. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Simple Notification Service (SNS) topics to publish stack related events.
     *
     * Default: - notifications are not sent for this stack.
     *
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     * events. 
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * The Simple Notification Service (SNS) topics to publish stack related events.
     *
     * Default: - notifications are not sent for this stack.
     *
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     * events. 
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding
     * to a parameter defined in the embedded template and a value representing
     * the value that you want to set for the parameter.
     *
     * The nested stack construct will automatically synthesize parameters in order
     * to bind references from the parent stack(s) into the nested stack.
     *
     * Default: - no user-defined parameters are passed to the nested stack
     *
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created. 
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * Policy to apply when the nested stack is removed.
     *
     * The default is `Destroy`, because all Removal Policies of resources inside the
     * Nested Stack should already have been set correctly. You normally should
     * not need to set this value.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy Policy to apply when the nested stack is removed. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The length of time that CloudFormation waits for the nested stack to reach the
     * CREATE_COMPLETE state.
     *
     * When CloudFormation detects that the nested stack has reached the
     * CREATE_COMPLETE state, it marks the nested stack resource as
     * CREATE_COMPLETE in the parent stack and resumes creating the parent stack.
     * If the timeout period expires before the nested stack reaches
     * CREATE_COMPLETE, CloudFormation marks the nested stack as failed and rolls
     * back both the nested stack and parent stack.
     *
     * Default: - no timeout
     *
     * @param timeout The length of time that CloudFormation waits for the nested stack to reach the
     * CREATE_COMPLETE state. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.NestedStack = cdkBuilder.build()
  }

  public companion object {
    public fun isNestedStack(x: Any): Boolean = software.amazon.awscdk.NestedStack.isNestedStack(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NestedStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NestedStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.NestedStack): NestedStack =
        NestedStack(cdkObject)

    internal fun unwrap(wrapped: NestedStack): software.amazon.awscdk.NestedStack =
        wrapped.cdkObject as software.amazon.awscdk.NestedStack
  }
}

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
 * import software.constructs.Construct;
 * import io.cloudshiftdev.awscdk.App;
 * import io.cloudshiftdev.awscdk.CfnOutput;
 * import io.cloudshiftdev.awscdk.NestedStack;
 * import io.cloudshiftdev.awscdk.NestedStackProps;
 * import io.cloudshiftdev.awscdk.Stack;
 * import io.cloudshiftdev.awscdk.services.apigateway.Deployment;
 * import io.cloudshiftdev.awscdk.services.apigateway.Method;
 * import io.cloudshiftdev.awscdk.services.apigateway.MockIntegration;
 * import io.cloudshiftdev.awscdk.services.apigateway.PassthroughBehavior;
 * import io.cloudshiftdev.awscdk.services.apigateway.RestApi;
 * import io.cloudshiftdev.awscdk.services.apigateway.Stage;
 * / **
 * * This file showcases how to split up a RestApi's Resources and Methods across nested stacks.
 * *
 * * The root stack 'RootStack' first defines a RestApi.
 * * Two nested stacks BooksStack and PetsStack, create corresponding Resources '/books' and
 * '/pets'.
 * * They are then deployed to a 'prod' Stage via a third nested stack - DeployStack.
 * *
 * * To verify this worked, go to the APIGateway
 * *&#47;
 * public class RootStack extends Stack {
 * public RootStack(Construct scope) {
 * super(scope, "integ-restapi-import-RootStack");
 * RestApi restApi = RestApi.Builder.create(this, "RestApi")
 * .cloudWatchRole(true)
 * .deploy(false)
 * .build();
 * restApi.root.addMethod("ANY");
 * PetsStack petsStack = new PetsStack(this, new ResourceNestedStackProps()
 * .restApiId(restApi.getRestApiId())
 * .rootResourceId(restApi.getRestApiRootResourceId())
 * );
 * BooksStack booksStack = new BooksStack(this, new ResourceNestedStackProps()
 * .restApiId(restApi.getRestApiId())
 * .rootResourceId(restApi.getRestApiRootResourceId())
 * );
 * new DeployStack(this, new DeployStackProps()
 * .restApiId(restApi.getRestApiId())
 * .methods(petsStack.methods.concat(booksStack.getMethods()))
 * );
 * CfnOutput.Builder.create(this, "PetsURL")
 * .value(String.format("https://%s.execute-api.%s.amazonaws.com/prod/pets", restApi.getRestApiId(),
 * this.region))
 * .build();
 * CfnOutput.Builder.create(this, "BooksURL")
 * .value(String.format("https://%s.execute-api.%s.amazonaws.com/prod/books",
 * restApi.getRestApiId(), this.region))
 * .build();
 * }
 * }
 * public class ResourceNestedStackProps extends NestedStackProps {
 * private String restApiId;
 * public String getRestApiId() {
 * return this.restApiId;
 * }
 * public ResourceNestedStackProps restApiId(String restApiId) {
 * this.restApiId = restApiId;
 * return this;
 * }
 * private String rootResourceId;
 * public String getRootResourceId() {
 * return this.rootResourceId;
 * }
 * public ResourceNestedStackProps rootResourceId(String rootResourceId) {
 * this.rootResourceId = rootResourceId;
 * return this;
 * }
 * }
 * public class PetsStack extends NestedStack {
 * public final Method[] methods;
 * public PetsStack(Construct scope, ResourceNestedStackProps props) {
 * super(scope, "integ-restapi-import-PetsStack", props);
 * IRestApi api = RestApi.fromRestApiAttributes(this, "RestApi", RestApiAttributes.builder()
 * .restApiId(props.getRestApiId())
 * .rootResourceId(props.getRootResourceId())
 * .build());
 * Method method = api.root.addResource("pets").addMethod("GET", MockIntegration.Builder.create()
 * .integrationResponses(List.of(IntegrationResponse.builder()
 * .statusCode("200")
 * .build()))
 * .passthroughBehavior(PassthroughBehavior.NEVER)
 * .requestTemplates(Map.of(
 * "application/json", "{ \"statusCode\": 200 }"))
 * .build(), MethodOptions.builder()
 * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
 * .build());
 * this.methods.push(method);
 * }
 * }
 * public class BooksStack extends NestedStack {
 * public final Method[] methods;
 * public BooksStack(Construct scope, ResourceNestedStackProps props) {
 * super(scope, "integ-restapi-import-BooksStack", props);
 * IRestApi api = RestApi.fromRestApiAttributes(this, "RestApi", RestApiAttributes.builder()
 * .restApiId(props.getRestApiId())
 * .rootResourceId(props.getRootResourceId())
 * .build());
 * Method method = api.root.addResource("books").addMethod("GET", MockIntegration.Builder.create()
 * .integrationResponses(List.of(IntegrationResponse.builder()
 * .statusCode("200")
 * .build()))
 * .passthroughBehavior(PassthroughBehavior.NEVER)
 * .requestTemplates(Map.of(
 * "application/json", "{ \"statusCode\": 200 }"))
 * .build(), MethodOptions.builder()
 * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
 * .build());
 * this.methods.push(method);
 * }
 * }
 * public class DeployStackProps extends NestedStackProps {
 * private String restApiId;
 * public String getRestApiId() {
 * return this.restApiId;
 * }
 * public DeployStackProps restApiId(String restApiId) {
 * this.restApiId = restApiId;
 * return this;
 * }
 * private Method[] methods;
 * public Method[] getMethods() {
 * return this.methods;
 * }
 * public DeployStackProps methods(Method[] methods) {
 * this.methods = methods;
 * return this;
 * }
 * }
 * public class DeployStack extends NestedStack {
 * public DeployStack(Construct scope, DeployStackProps props) {
 * super(scope, "integ-restapi-import-DeployStack", props);
 * Deployment deployment = Deployment.Builder.create(this, "Deployment")
 * .api(RestApi.fromRestApiId(this, "RestApi", props.getRestApiId()))
 * .build();
 * if (props.getMethods()) {
 * for (Object method : props.getMethods()) {
 * deployment.node.addDependency(method);
 * }
 * }
 * Stage.Builder.create(this, "Stage").deployment(deployment).build();
 * }
 * }
 * new RootStack(new App());
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

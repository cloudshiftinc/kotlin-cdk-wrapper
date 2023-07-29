@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.NestedStackProps
import software.amazon.awscdk.RemovalPolicy

/**
 * Initialization props for the `NestedStack` construct.
 *
 * Example:
 * ```
 * import software.constructs.Construct;
 * import software.amazon.awscdk.App;
 * import software.amazon.awscdk.CfnOutput;
 * import software.amazon.awscdk.NestedStack;
 * import software.amazon.awscdk.NestedStackProps;
 * import software.amazon.awscdk.Stack;
 * import software.amazon.awscdk.services.apigateway.Deployment;
 * import software.amazon.awscdk.services.apigateway.Method;
 * import software.amazon.awscdk.services.apigateway.MockIntegration;
 * import software.amazon.awscdk.services.apigateway.PassthroughBehavior;
 * import software.amazon.awscdk.services.apigateway.RestApi;
 * import software.amazon.awscdk.services.apigateway.Stage;
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
@CdkDslMarker
public class NestedStackPropsDsl {
    private val cdkBuilder: NestedStackProps.Builder = NestedStackProps.builder()

    private val _notificationArns: MutableList<String> = mutableListOf()

    /** @param description A description of the stack. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     *   events.
     */
    public fun notificationArns(vararg notificationArns: String) {
        _notificationArns.addAll(listOf(*notificationArns))
    }

    /**
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     *   events.
     */
    public fun notificationArns(notificationArns: Collection<String>) {
        _notificationArns.addAll(notificationArns)
    }

    /**
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     *   when this nested stack is created. Each parameter has a name corresponding to a parameter
     *   defined in the embedded template and a value representing the value that you want to set
     *   for the parameter.
     *
     * The nested stack construct will automatically synthesize parameters in order to bind
     * references from the parent stack(s) into the nested stack.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param removalPolicy Policy to apply when the nested stack is removed. The default is
     *   `Destroy`, because all Removal Policies of resources inside the Nested Stack should already
     *   have been set correctly. You normally should not need to set this value.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * @param timeout The length of time that CloudFormation waits for the nested stack to reach the
     *   CREATE_COMPLETE state. When CloudFormation detects that the nested stack has reached the
     *   CREATE_COMPLETE state, it marks the nested stack resource as CREATE_COMPLETE in the parent
     *   stack and resumes creating the parent stack. If the timeout period expires before the
     *   nested stack reaches CREATE_COMPLETE, CloudFormation marks the nested stack as failed and
     *   rolls back both the nested stack and parent stack.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): NestedStackProps {
        if (_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
        return cdkBuilder.build()
    }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Attributes that can be specified when importing a RestApi.
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
public interface RestApiAttributes {
  /**
   * The ID of the API Gateway RestApi.
   */
  public fun restApiId(): String

  /**
   * The name of the API Gateway RestApi.
   *
   * Default: - ID of the RestApi construct.
   */
  public fun restApiName(): String? = unwrap(this).getRestApiName()

  /**
   * The resource ID of the root resource.
   */
  public fun rootResourceId(): String

  /**
   * A builder for [RestApiAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param restApiId The ID of the API Gateway RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * @param restApiName The name of the API Gateway RestApi.
     */
    public fun restApiName(restApiName: String)

    /**
     * @param rootResourceId The resource ID of the root resource. 
     */
    public fun rootResourceId(rootResourceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RestApiAttributes.Builder =
        software.amazon.awscdk.services.apigateway.RestApiAttributes.builder()

    /**
     * @param restApiId The ID of the API Gateway RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param restApiName The name of the API Gateway RestApi.
     */
    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    /**
     * @param rootResourceId The resource ID of the root resource. 
     */
    override fun rootResourceId(rootResourceId: String) {
      cdkBuilder.rootResourceId(rootResourceId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RestApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.RestApiAttributes,
  ) : CdkObject(cdkObject),
      RestApiAttributes {
    /**
     * The ID of the API Gateway RestApi.
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * The name of the API Gateway RestApi.
     *
     * Default: - ID of the RestApi construct.
     */
    override fun restApiName(): String? = unwrap(this).getRestApiName()

    /**
     * The resource ID of the root resource.
     */
    override fun rootResourceId(): String = unwrap(this).getRootResourceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RestApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiAttributes):
        RestApiAttributes = CdkObjectWrappers.wrap(cdkObject) as? RestApiAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RestApiAttributes):
        software.amazon.awscdk.services.apigateway.RestApiAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RestApiAttributes
  }
}

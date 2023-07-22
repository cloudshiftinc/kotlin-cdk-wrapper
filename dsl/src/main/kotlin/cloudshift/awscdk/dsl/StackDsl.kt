@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Environment
import software.amazon.awscdk.IStackSynthesizer
import software.amazon.awscdk.PermissionsBoundary
import software.amazon.awscdk.Stack
import software.constructs.Construct

/**
 * A root construct which represents a single CloudFormation stack.
 *
 * Example:
 *
 * ```
 * import path.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.kinesisanalytics.flink.alpha.*;
 * App app = new App();
 * Stack stack = new Stack(app, "FlinkAppTest");
 * Application flinkApp = Application.Builder.create(stack, "App")
 * .code(ApplicationCode.fromAsset(join(__dirname, "code-asset")))
 * .runtime(Runtime.FLINK_1_11)
 * .build();
 * Alarm.Builder.create(stack, "Alarm")
 * .metric(flinkApp.metricFullRestarts())
 * .evaluationPeriods(1)
 * .threshold(3)
 * .build();
 * app.synth();
 * ```
 */
@CdkDslMarker
public class StackDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Stack.Builder = Stack.Builder.create(scope, id)

  /**
   * Include runtime versioning information in this Stack.
   *
   * Default: `analyticsReporting` setting of containing `App`, or value of
   * 'aws:cdk:version-reporting' context key
   *
   * @param analyticsReporting Include runtime versioning information in this Stack. 
   */
  public fun analyticsReporting(analyticsReporting: Boolean) {
    cdkBuilder.analyticsReporting(analyticsReporting)
  }

  /**
   * Enable this flag to allow native cross region stack references.
   *
   * Enabling this will create a CloudFormation custom resource
   * in both the producing stack and consuming stack in order to perform the export/import
   *
   * This feature is currently experimental
   *
   * Default: false
   *
   * @param crossRegionReferences Enable this flag to allow native cross region stack references. 
   */
  public fun crossRegionReferences(crossRegionReferences: Boolean) {
    cdkBuilder.crossRegionReferences(crossRegionReferences)
  }

  /**
   * A description of the stack.
   *
   * Default: - No description.
   *
   * @param description A description of the stack. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The AWS environment (account/region) where this stack will be deployed.
   *
   * Set the `region`/`account` fields of `env` to either a concrete value to
   * select the indicated environment (recommended for production stacks), or to
   * the values of environment variables
   * `CDK_DEFAULT_REGION`/`CDK_DEFAULT_ACCOUNT` to let the target environment
   * depend on the AWS credentials/configuration that the CDK CLI is executed
   * under (recommended for development stacks).
   *
   * If the `Stack` is instantiated inside a `Stage`, any undefined
   * `region`/`account` fields from `env` will default to the same field on the
   * encompassing `Stage`, if configured there.
   *
   * If either `region` or `account` are not set nor inherited from `Stage`, the
   * Stack will be considered "*environment-agnostic*"". Environment-agnostic
   * stacks can be deployed to any environment but may not be able to take
   * advantage of all features of the CDK. For example, they will not be able to
   * use environmental context lookups such as `ec2.Vpc.fromLookup` and will not
   * automatically translate Service Principals to the right format based on the
   * environment's AWS partition, and other such enhancements.
   *
   * Default: - The environment of the containing `Stage` if available,
   * otherwise create the stack will be environment-agnostic.
   *
   * Example:
   *
   * ```
   * // Use a concrete account and region to deploy this stack to:
   * // `.account` and `.region` will simply return these values.
   * // Use a concrete account and region to deploy this stack to:
   * // `.account` and `.region` will simply return these values.
   * Stack.Builder.create(app, "Stack1")
   * .env(Environment.builder()
   * .account("123456789012")
   * .region("us-east-1")
   * .build())
   * .build();
   * // Use the CLI's current credentials to determine the target environment:
   * // `.account` and `.region` will reflect the account+region the CLI
   * // is configured to use (based on the user CLI credentials)
   * // Use the CLI's current credentials to determine the target environment:
   * // `.account` and `.region` will reflect the account+region the CLI
   * // is configured to use (based on the user CLI credentials)
   * Stack.Builder.create(app, "Stack2")
   * .env(Environment.builder()
   * .account(process.getEnv().getCDK_DEFAULT_ACCOUNT())
   * .region(process.getEnv().getCDK_DEFAULT_REGION())
   * .build())
   * .build();
   * // Define multiple stacks stage associated with an environment
   * Stage myStage = Stage.Builder.create(app, "MyStage")
   * .env(Environment.builder()
   * .account("123456789012")
   * .region("us-east-1")
   * .build())
   * .build();
   * // both of these stacks will use the stage's account/region:
   * // `.account` and `.region` will resolve to the concrete values as above
   * // both of these stacks will use the stage's account/region:
   * // `.account` and `.region` will resolve to the concrete values as above
   * new MyStack(myStage, "Stack1");
   * new YourStack(myStage, "Stack2");
   * // Define an environment-agnostic stack:
   * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
   * "AWS::Region" }` respectively.
   * // which will only resolve to actual values by CloudFormation during deployment.
   * // Define an environment-agnostic stack:
   * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
   * "AWS::Region" }` respectively.
   * // which will only resolve to actual values by CloudFormation during deployment.
   * new MyStack(app, "Stack1");
   * ```
   *
   * @param env The AWS environment (account/region) where this stack will be deployed. 
   */
  public fun env(env: EnvironmentDsl.() -> Unit = {}) {
    val builder = EnvironmentDsl()
    builder.apply(env)
    cdkBuilder.env(builder.build())
  }

  /**
   * The AWS environment (account/region) where this stack will be deployed.
   *
   * Set the `region`/`account` fields of `env` to either a concrete value to
   * select the indicated environment (recommended for production stacks), or to
   * the values of environment variables
   * `CDK_DEFAULT_REGION`/`CDK_DEFAULT_ACCOUNT` to let the target environment
   * depend on the AWS credentials/configuration that the CDK CLI is executed
   * under (recommended for development stacks).
   *
   * If the `Stack` is instantiated inside a `Stage`, any undefined
   * `region`/`account` fields from `env` will default to the same field on the
   * encompassing `Stage`, if configured there.
   *
   * If either `region` or `account` are not set nor inherited from `Stage`, the
   * Stack will be considered "*environment-agnostic*"". Environment-agnostic
   * stacks can be deployed to any environment but may not be able to take
   * advantage of all features of the CDK. For example, they will not be able to
   * use environmental context lookups such as `ec2.Vpc.fromLookup` and will not
   * automatically translate Service Principals to the right format based on the
   * environment's AWS partition, and other such enhancements.
   *
   * Default: - The environment of the containing `Stage` if available,
   * otherwise create the stack will be environment-agnostic.
   *
   * Example:
   *
   * ```
   * // Use a concrete account and region to deploy this stack to:
   * // `.account` and `.region` will simply return these values.
   * // Use a concrete account and region to deploy this stack to:
   * // `.account` and `.region` will simply return these values.
   * Stack.Builder.create(app, "Stack1")
   * .env(Environment.builder()
   * .account("123456789012")
   * .region("us-east-1")
   * .build())
   * .build();
   * // Use the CLI's current credentials to determine the target environment:
   * // `.account` and `.region` will reflect the account+region the CLI
   * // is configured to use (based on the user CLI credentials)
   * // Use the CLI's current credentials to determine the target environment:
   * // `.account` and `.region` will reflect the account+region the CLI
   * // is configured to use (based on the user CLI credentials)
   * Stack.Builder.create(app, "Stack2")
   * .env(Environment.builder()
   * .account(process.getEnv().getCDK_DEFAULT_ACCOUNT())
   * .region(process.getEnv().getCDK_DEFAULT_REGION())
   * .build())
   * .build();
   * // Define multiple stacks stage associated with an environment
   * Stage myStage = Stage.Builder.create(app, "MyStage")
   * .env(Environment.builder()
   * .account("123456789012")
   * .region("us-east-1")
   * .build())
   * .build();
   * // both of these stacks will use the stage's account/region:
   * // `.account` and `.region` will resolve to the concrete values as above
   * // both of these stacks will use the stage's account/region:
   * // `.account` and `.region` will resolve to the concrete values as above
   * new MyStack(myStage, "Stack1");
   * new YourStack(myStage, "Stack2");
   * // Define an environment-agnostic stack:
   * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
   * "AWS::Region" }` respectively.
   * // which will only resolve to actual values by CloudFormation during deployment.
   * // Define an environment-agnostic stack:
   * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
   * "AWS::Region" }` respectively.
   * // which will only resolve to actual values by CloudFormation during deployment.
   * new MyStack(app, "Stack1");
   * ```
   *
   * @param env The AWS environment (account/region) where this stack will be deployed. 
   */
  public fun env(env: Environment) {
    cdkBuilder.env(env)
  }

  /**
   * Options for applying a permissions boundary to all IAM Roles and Users created within this
   * Stage.
   *
   * Default: - no permissions boundary is applied
   *
   * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
   * Users created within this Stage. 
   */
  public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  /**
   * Name to deploy the stack with.
   *
   * Default: - Derived from construct path.
   *
   * @param stackName Name to deploy the stack with. 
   */
  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  /**
   * Enable this flag to suppress indentation in generated CloudFormation templates.
   *
   * If not specified, the value of the `&#64;aws-cdk/core:suppressTemplateIndentation`
   * context key will be used. If that is not specified, then the
   * default value `false` will be used.
   *
   * Default: - the value of `@aws-cdk/core:suppressTemplateIndentation`, or `false` if that is not
   * set.
   *
   * @param suppressTemplateIndentation Enable this flag to suppress indentation in generated
   * CloudFormation templates. 
   */
  public fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean) {
    cdkBuilder.suppressTemplateIndentation(suppressTemplateIndentation)
  }

  /**
   * Synthesis method to use while deploying this stack.
   *
   * The Stack Synthesizer controls aspects of synthesis and deployment,
   * like how assets are referenced and what IAM roles to use. For more
   * information, see the README of the main CDK package.
   *
   * If not specified, the `defaultStackSynthesizer` from `App` will be used.
   * If that is not specified, `DefaultStackSynthesizer` is used if
   * `&#64;aws-cdk/core:newStyleStackSynthesis` is set to `true` or the CDK major
   * version is v2. In CDK v1 `LegacyStackSynthesizer` is the default if no
   * other synthesizer is specified.
   *
   * Default: - The synthesizer specified on `App`, or `DefaultStackSynthesizer` otherwise.
   *
   * @param synthesizer Synthesis method to use while deploying this stack. 
   */
  public fun synthesizer(synthesizer: IStackSynthesizer) {
    cdkBuilder.synthesizer(synthesizer)
  }

  /**
   * Stack tags that will be applied to all the taggable resources and the stack itself.
   *
   * Default: {}
   *
   * @param tags Stack tags that will be applied to all the taggable resources and the stack itself.
   * 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * Whether to enable termination protection for this stack.
   *
   * Default: false
   *
   * @param terminationProtection Whether to enable termination protection for this stack. 
   */
  public fun terminationProtection(terminationProtection: Boolean) {
    cdkBuilder.terminationProtection(terminationProtection)
  }

  public fun build(): Stack = cdkBuilder.build()
}

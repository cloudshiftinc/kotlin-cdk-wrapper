@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * Stack stack1 = Stack.Builder.create(app, "Stack1")
 * .env(Environment.builder()
 * .region("us-east-1")
 * .build())
 * .crossRegionReferences(true)
 * .build();
 * Certificate cert = Certificate.Builder.create(stack1, "Cert")
 * .domainName("*.example.com")
 * .validation(CertificateValidation.fromDns(PublicHostedZone.fromHostedZoneId(stack1, "Zone",
 * "Z0329774B51CGXTDQV3X")))
 * .build();
 * Stack stack2 = Stack.Builder.create(app, "Stack2")
 * .env(Environment.builder()
 * .region("us-east-2")
 * .build())
 * .crossRegionReferences(true)
 * .build();
 * Distribution.Builder.create(stack2, "Distribution")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new HttpOrigin("example.com"))
 * .build())
 * .domainNames(List.of("dev.example.com"))
 * .certificate(cert)
 * .build();
 * ```
 */
public interface StackProps {
  /**
   * Include runtime versioning information in this Stack.
   *
   * Default: `analyticsReporting` setting of containing `App`, or value of
   * 'aws:cdk:version-reporting' context key
   */
  public fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

  /**
   * Enable this flag to allow native cross region stack references.
   *
   * Enabling this will create a CloudFormation custom resource
   * in both the producing stack and consuming stack in order to perform the export/import
   *
   * This feature is currently experimental
   *
   * Default: false
   */
  public fun crossRegionReferences(): Boolean? = unwrap(this).getCrossRegionReferences()

  /**
   * A description of the stack.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun env(): Environment? = unwrap(this).getEnv()?.let(Environment::wrap)

  /**
   * Options for applying a permissions boundary to all IAM Roles and Users created within this
   * Stage.
   *
   * Default: - no permissions boundary is applied
   */
  public fun permissionsBoundary(): PermissionsBoundary? =
      unwrap(this).getPermissionsBoundary()?.let(PermissionsBoundary::wrap)

  /**
   * Name to deploy the stack with.
   *
   * Default: - Derived from construct path.
   */
  public fun stackName(): String? = unwrap(this).getStackName()

  /**
   * Enable this flag to suppress indentation in generated CloudFormation templates.
   *
   * If not specified, the value of the `&#64;aws-cdk/core:suppressTemplateIndentation`
   * context key will be used. If that is not specified, then the
   * default value `false` will be used.
   *
   * Default: - the value of `@aws-cdk/core:suppressTemplateIndentation`, or `false` if that is not
   * set.
   */
  public fun suppressTemplateIndentation(): Boolean? = unwrap(this).getSuppressTemplateIndentation()

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
   */
  public fun synthesizer(): IStackSynthesizer? =
      unwrap(this).getSynthesizer()?.let(IStackSynthesizer::wrap)

  /**
   * Stack tags that will be applied to all the taggable resources and the stack itself.
   *
   * Default: {}
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Whether to enable termination protection for this stack.
   *
   * Default: false
   */
  public fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

  /**
   * A builder for [StackProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param analyticsReporting Include runtime versioning information in this Stack.
     */
    public fun analyticsReporting(analyticsReporting: Boolean)

    /**
     * @param crossRegionReferences Enable this flag to allow native cross region stack references.
     * Enabling this will create a CloudFormation custom resource
     * in both the producing stack and consuming stack in order to perform the export/import
     *
     * This feature is currently experimental
     */
    public fun crossRegionReferences(crossRegionReferences: Boolean)

    /**
     * @param description A description of the stack.
     */
    public fun description(description: String)

    /**
     * @param env The AWS environment (account/region) where this stack will be deployed.
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
     */
    public fun env(env: Environment)

    /**
     * @param env The AWS environment (account/region) where this stack will be deployed.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06595668ad8f96a9bf80be18cf5bc6ae0f52849715a13f6b3ed94434fd56c74f")
    public fun env(env: Environment.Builder.() -> Unit)

    /**
     * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
     * Users created within this Stage.
     */
    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary)

    /**
     * @param stackName Name to deploy the stack with.
     */
    public fun stackName(stackName: String)

    /**
     * @param suppressTemplateIndentation Enable this flag to suppress indentation in generated
     * CloudFormation templates.
     * If not specified, the value of the `&#64;aws-cdk/core:suppressTemplateIndentation`
     * context key will be used. If that is not specified, then the
     * default value `false` will be used.
     */
    public fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean)

    /**
     * @param synthesizer Synthesis method to use while deploying this stack.
     * The Stack Synthesizer controls aspects of synthesis and deployment,
     * like how assets are referenced and what IAM roles to use. For more
     * information, see the README of the main CDK package.
     *
     * If not specified, the `defaultStackSynthesizer` from `App` will be used.
     * If that is not specified, `DefaultStackSynthesizer` is used if
     * `&#64;aws-cdk/core:newStyleStackSynthesis` is set to `true` or the CDK major
     * version is v2. In CDK v1 `LegacyStackSynthesizer` is the default if no
     * other synthesizer is specified.
     */
    public fun synthesizer(synthesizer: IStackSynthesizer)

    /**
     * @param tags Stack tags that will be applied to all the taggable resources and the stack
     * itself.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param terminationProtection Whether to enable termination protection for this stack.
     */
    public fun terminationProtection(terminationProtection: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.StackProps.Builder =
        software.amazon.awscdk.StackProps.builder()

    /**
     * @param analyticsReporting Include runtime versioning information in this Stack.
     */
    override fun analyticsReporting(analyticsReporting: Boolean) {
      cdkBuilder.analyticsReporting(analyticsReporting)
    }

    /**
     * @param crossRegionReferences Enable this flag to allow native cross region stack references.
     * Enabling this will create a CloudFormation custom resource
     * in both the producing stack and consuming stack in order to perform the export/import
     *
     * This feature is currently experimental
     */
    override fun crossRegionReferences(crossRegionReferences: Boolean) {
      cdkBuilder.crossRegionReferences(crossRegionReferences)
    }

    /**
     * @param description A description of the stack.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param env The AWS environment (account/region) where this stack will be deployed.
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
     */
    override fun env(env: Environment) {
      cdkBuilder.env(env.let(Environment.Companion::unwrap))
    }

    /**
     * @param env The AWS environment (account/region) where this stack will be deployed.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06595668ad8f96a9bf80be18cf5bc6ae0f52849715a13f6b3ed94434fd56c74f")
    override fun env(env: Environment.Builder.() -> Unit): Unit = env(Environment(env))

    /**
     * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
     * Users created within this Stage.
     */
    override fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundary.Companion::unwrap))
    }

    /**
     * @param stackName Name to deploy the stack with.
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    /**
     * @param suppressTemplateIndentation Enable this flag to suppress indentation in generated
     * CloudFormation templates.
     * If not specified, the value of the `&#64;aws-cdk/core:suppressTemplateIndentation`
     * context key will be used. If that is not specified, then the
     * default value `false` will be used.
     */
    override fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean) {
      cdkBuilder.suppressTemplateIndentation(suppressTemplateIndentation)
    }

    /**
     * @param synthesizer Synthesis method to use while deploying this stack.
     * The Stack Synthesizer controls aspects of synthesis and deployment,
     * like how assets are referenced and what IAM roles to use. For more
     * information, see the README of the main CDK package.
     *
     * If not specified, the `defaultStackSynthesizer` from `App` will be used.
     * If that is not specified, `DefaultStackSynthesizer` is used if
     * `&#64;aws-cdk/core:newStyleStackSynthesis` is set to `true` or the CDK major
     * version is v2. In CDK v1 `LegacyStackSynthesizer` is the default if no
     * other synthesizer is specified.
     */
    override fun synthesizer(synthesizer: IStackSynthesizer) {
      cdkBuilder.synthesizer(synthesizer.let(IStackSynthesizer.Companion::unwrap))
    }

    /**
     * @param tags Stack tags that will be applied to all the taggable resources and the stack
     * itself.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param terminationProtection Whether to enable termination protection for this stack.
     */
    override fun terminationProtection(terminationProtection: Boolean) {
      cdkBuilder.terminationProtection(terminationProtection)
    }

    public fun build(): software.amazon.awscdk.StackProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.StackProps,
  ) : CdkObject(cdkObject), StackProps {
    /**
     * Include runtime versioning information in this Stack.
     *
     * Default: `analyticsReporting` setting of containing `App`, or value of
     * 'aws:cdk:version-reporting' context key
     */
    override fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

    /**
     * Enable this flag to allow native cross region stack references.
     *
     * Enabling this will create a CloudFormation custom resource
     * in both the producing stack and consuming stack in order to perform the export/import
     *
     * This feature is currently experimental
     *
     * Default: false
     */
    override fun crossRegionReferences(): Boolean? = unwrap(this).getCrossRegionReferences()

    /**
     * A description of the stack.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun env(): Environment? = unwrap(this).getEnv()?.let(Environment::wrap)

    /**
     * Options for applying a permissions boundary to all IAM Roles and Users created within this
     * Stage.
     *
     * Default: - no permissions boundary is applied
     */
    override fun permissionsBoundary(): PermissionsBoundary? =
        unwrap(this).getPermissionsBoundary()?.let(PermissionsBoundary::wrap)

    /**
     * Name to deploy the stack with.
     *
     * Default: - Derived from construct path.
     */
    override fun stackName(): String? = unwrap(this).getStackName()

    /**
     * Enable this flag to suppress indentation in generated CloudFormation templates.
     *
     * If not specified, the value of the `&#64;aws-cdk/core:suppressTemplateIndentation`
     * context key will be used. If that is not specified, then the
     * default value `false` will be used.
     *
     * Default: - the value of `@aws-cdk/core:suppressTemplateIndentation`, or `false` if that is
     * not set.
     */
    override fun suppressTemplateIndentation(): Boolean? =
        unwrap(this).getSuppressTemplateIndentation()

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
     */
    override fun synthesizer(): IStackSynthesizer? =
        unwrap(this).getSynthesizer()?.let(IStackSynthesizer::wrap)

    /**
     * Stack tags that will be applied to all the taggable resources and the stack itself.
     *
     * Default: {}
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * Whether to enable termination protection for this stack.
     *
     * Default: false
     */
    override fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.StackProps): StackProps =
        CdkObjectWrappers.wrap(cdkObject) as? StackProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackProps): software.amazon.awscdk.StackProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.StackProps
  }
}

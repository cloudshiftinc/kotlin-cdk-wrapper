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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Environment
import software.amazon.awscdk.IStackSynthesizer
import software.amazon.awscdk.PermissionsBoundary
import software.amazon.awscdk.StackProps

/**
 * Example:
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
@CdkDslMarker
public class StackPropsDsl {
    private val cdkBuilder: StackProps.Builder = StackProps.builder()

    /** @param analyticsReporting Include runtime versioning information in this Stack. */
    public fun analyticsReporting(analyticsReporting: Boolean) {
        cdkBuilder.analyticsReporting(analyticsReporting)
    }

    /**
     * @param crossRegionReferences Enable this flag to allow native cross region stack references.
     *   Enabling this will create a CloudFormation custom resource in both the producing stack and
     *   consuming stack in order to perform the export/import
     *
     * This feature is currently experimental
     */
    public fun crossRegionReferences(crossRegionReferences: Boolean) {
        cdkBuilder.crossRegionReferences(crossRegionReferences)
    }

    /** @param description A description of the stack. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param env The AWS environment (account/region) where this stack will be deployed. Set the
     *   `region`/`account` fields of `env` to either a concrete value to select the indicated
     *   environment (recommended for production stacks), or to the values of environment variables
     *   `CDK_DEFAULT_REGION`/`CDK_DEFAULT_ACCOUNT` to let the target environment depend on the AWS
     *   credentials/configuration that the CDK CLI is executed under (recommended for development
     *   stacks).
     *
     * If the `Stack` is instantiated inside a `Stage`, any undefined `region`/`account` fields from
     * `env` will default to the same field on the encompassing `Stage`, if configured there.
     *
     * If either `region` or `account` are not set nor inherited from `Stage`, the Stack will be
     * considered "*environment-agnostic*"". Environment-agnostic stacks can be deployed to any
     * environment but may not be able to take advantage of all features of the CDK. For example,
     * they will not be able to use environmental context lookups such as `ec2.Vpc.fromLookup` and
     * will not automatically translate Service Principals to the right format based on the
     * environment's AWS partition, and other such enhancements.
     */
    public fun env(env: EnvironmentDsl.() -> Unit = {}) {
        val builder = EnvironmentDsl()
        builder.apply(env)
        cdkBuilder.env(builder.build())
    }

    /**
     * @param env The AWS environment (account/region) where this stack will be deployed. Set the
     *   `region`/`account` fields of `env` to either a concrete value to select the indicated
     *   environment (recommended for production stacks), or to the values of environment variables
     *   `CDK_DEFAULT_REGION`/`CDK_DEFAULT_ACCOUNT` to let the target environment depend on the AWS
     *   credentials/configuration that the CDK CLI is executed under (recommended for development
     *   stacks).
     *
     * If the `Stack` is instantiated inside a `Stage`, any undefined `region`/`account` fields from
     * `env` will default to the same field on the encompassing `Stage`, if configured there.
     *
     * If either `region` or `account` are not set nor inherited from `Stage`, the Stack will be
     * considered "*environment-agnostic*"". Environment-agnostic stacks can be deployed to any
     * environment but may not be able to take advantage of all features of the CDK. For example,
     * they will not be able to use environmental context lookups such as `ec2.Vpc.fromLookup` and
     * will not automatically translate Service Principals to the right format based on the
     * environment's AWS partition, and other such enhancements.
     */
    public fun env(env: Environment) {
        cdkBuilder.env(env)
    }

    /**
     * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
     *   Users created within this Stage.
     */
    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /** @param stackName Name to deploy the stack with. */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    /**
     * @param suppressTemplateIndentation Enable this flag to suppress indentation in generated
     *   CloudFormation templates. If not specified, the value of the
     *   `&#64;aws-cdk/core:suppressTemplateIndentation` context key will be used. If that is not
     *   specified, then the default value `false` will be used.
     */
    public fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean) {
        cdkBuilder.suppressTemplateIndentation(suppressTemplateIndentation)
    }

    /**
     * @param synthesizer Synthesis method to use while deploying this stack. The Stack Synthesizer
     *   controls aspects of synthesis and deployment, like how assets are referenced and what IAM
     *   roles to use. For more information, see the README of the main CDK package.
     *
     * If not specified, the `defaultStackSynthesizer` from `App` will be used. If that is not
     * specified, `DefaultStackSynthesizer` is used if `&#64;aws-cdk/core:newStyleStackSynthesis` is
     * set to `true` or the CDK major version is v2. In CDK v1 `LegacyStackSynthesizer` is the
     * default if no other synthesizer is specified.
     */
    public fun synthesizer(synthesizer: IStackSynthesizer) {
        cdkBuilder.synthesizer(synthesizer)
    }

    /**
     * @param tags Stack tags that will be applied to all the taggable resources and the stack
     *   itself.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param terminationProtection Whether to enable termination protection for this stack. */
    public fun terminationProtection(terminationProtection: Boolean) {
        cdkBuilder.terminationProtection(terminationProtection)
    }

    public fun build(): StackProps = cdkBuilder.build()
}

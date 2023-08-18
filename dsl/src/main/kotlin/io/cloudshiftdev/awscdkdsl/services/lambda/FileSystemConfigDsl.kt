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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.ConnectionsDsl
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.lambda.FileSystemConfig
import software.constructs.IDependable

/**
 * FileSystem configurations for the Lambda function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.lambda.*;
 * import software.constructs.*;
 * Connections connections;
 * IDependable dependable;
 * PolicyStatement policyStatement;
 * FileSystemConfig fileSystemConfig = FileSystemConfig.builder()
 * .arn("arn")
 * .localMountPath("localMountPath")
 * // the properties below are optional
 * .connections(connections)
 * .dependency(List.of(dependable))
 * .policies(List.of(policyStatement))
 * .build();
 * ```
 */
@CdkDslMarker
public class FileSystemConfigDsl {
    private val cdkBuilder: FileSystemConfig.Builder = FileSystemConfig.builder()

    private val _dependency: MutableList<IDependable> = mutableListOf()

    private val _policies: MutableList<PolicyStatement> = mutableListOf()

    /** @param arn ARN of the access point. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /** @param connections connections object used to allow ingress traffic from lambda function. */
    public fun connections(connections: ConnectionsDsl.() -> Unit = {}) {
        val builder = ConnectionsDsl()
        builder.apply(connections)
        cdkBuilder.connections(builder.build())
    }

    /** @param connections connections object used to allow ingress traffic from lambda function. */
    public fun connections(connections: Connections) {
        cdkBuilder.connections(connections)
    }

    /** @param dependency array of IDependable that lambda function depends on. */
    public fun dependency(vararg dependency: IDependable) {
        _dependency.addAll(listOf(*dependency))
    }

    /** @param dependency array of IDependable that lambda function depends on. */
    public fun dependency(dependency: Collection<IDependable>) {
        _dependency.addAll(dependency)
    }

    /** @param localMountPath mount path in the lambda runtime environment. */
    public fun localMountPath(localMountPath: String) {
        cdkBuilder.localMountPath(localMountPath)
    }

    /** @param policies additional IAM policies required for the lambda function. */
    public fun policies(policies: PolicyStatementDsl.() -> Unit) {
        _policies.add(PolicyStatementDsl().apply(policies).build())
    }

    /** @param policies additional IAM policies required for the lambda function. */
    public fun policies(policies: Collection<PolicyStatement>) {
        _policies.addAll(policies)
    }

    public fun build(): FileSystemConfig {
        if (_dependency.isNotEmpty()) cdkBuilder.dependency(_dependency)
        if (_policies.isNotEmpty()) cdkBuilder.policies(_policies)
        return cdkBuilder.build()
    }
}

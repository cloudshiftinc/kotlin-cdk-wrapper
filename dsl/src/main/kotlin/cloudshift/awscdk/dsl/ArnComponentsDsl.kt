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
import software.amazon.awscdk.ArnComponents
import software.amazon.awscdk.ArnFormat

/**
 * Example:
 * ```
 * PublicHostedZone subZone = PublicHostedZone.Builder.create(this, "SubZone")
 * .zoneName("sub.someexample.com")
 * .build();
 * // import the delegation role by constructing the roleArn
 * String delegationRoleArn = Stack.of(this).formatArn(ArnComponents.builder()
 * .region("") // IAM is global in each partition
 * .service("iam")
 * .account("parent-account-id")
 * .resource("role")
 * .resourceName("MyDelegationRole")
 * .build());
 * IRole delegationRole = Role.fromRoleArn(this, "DelegationRole", delegationRoleArn);
 * // create the record
 * // create the record
 * CrossAccountZoneDelegationRecord.Builder.create(this, "delegate")
 * .delegatedZone(subZone)
 * .parentHostedZoneName("someexample.com") // or you can use parentHostedZoneId
 * .delegationRole(delegationRole)
 * .build();
 * ```
 */
@CdkDslMarker
public class ArnComponentsDsl {
    private val cdkBuilder: ArnComponents.Builder = ArnComponents.builder()

    /**
     * @param account The ID of the AWS account that owns the resource, without the hyphens. For
     *   example, 123456789012. Note that the ARNs for some resources don't require an account
     *   number, so this component might be omitted.
     */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /** @param arnFormat The specific ARN format to use for this ARN value. */
    public fun arnFormat(arnFormat: ArnFormat) {
        cdkBuilder.arnFormat(arnFormat)
    }

    /**
     * @param partition The partition that the resource is in. For standard AWS regions, the
     *   partition is aws. If you have resources in other partitions, the partition is
     *   aws-partitionname. For example, the partition for resources in the China (Beijing) region
     *   is aws-cn.
     */
    public fun partition(partition: String) {
        cdkBuilder.partition(partition)
    }

    /**
     * @param region The region the resource resides in. Note that the ARNs for some resources do
     *   not require a region, so this component might be omitted.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param resource Resource type (e.g. "table", "autoScalingGroup", "certificate"). For some
     *   resource types, e.g. S3 buckets, this field defines the bucket name.
     */
    public fun resource(resource: String) {
        cdkBuilder.resource(resource)
    }

    /**
     * @param resourceName Resource name or path within the resource (i.e. S3 bucket object key) or
     *   a wildcard such as `"*"`. This is service-dependent.
     */
    public fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
    }

    /**
     * @param service The service namespace that identifies the AWS product (for example, 's3',
     *   'iam', 'codepipline').
     */
    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun build(): ArnComponents = cdkBuilder.build()
}

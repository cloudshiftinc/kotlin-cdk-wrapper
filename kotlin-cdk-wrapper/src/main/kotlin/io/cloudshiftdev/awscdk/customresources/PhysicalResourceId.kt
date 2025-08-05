@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Physical ID of the custom resource.
 *
 * Example:
 *
 * ```
 * String crossAccountRoleArn = "arn:aws:iam::OTHERACCOUNT:role/CrossAccountRoleName"; // arn of
 * role deployed in separate account
 * String callRegion = "us-west-1"; // sdk call to be made in specified region (optional)
 * // sdk call to be made in specified region (optional)
 * AwsCustomResource.Builder.create(this, "CrossAccount")
 * .onCreate(AwsSdkCall.builder()
 * .assumedRoleArn(crossAccountRoleArn)
 * .region(callRegion) // optional
 * .service("sts")
 * .action("GetCallerIdentity")
 * .physicalResourceId(PhysicalResourceId.of("id"))
 * .build())
 * .policy(AwsCustomResourcePolicy.fromStatements(List.of(PolicyStatement.fromJson(Map.of(
 * "Effect", "Allow",
 * "Action", "sts:AssumeRole",
 * "Resource", crossAccountRoleArn)))))
 * .build();
 * ```
 */
public open class PhysicalResourceId(
  cdkObject: software.amazon.awscdk.customresources.PhysicalResourceId,
) : CdkObject(cdkObject) {
  /**
   * Literal string to be used as the physical id.
   */
  public open fun id(): String? = unwrap(this).getId()

  /**
   * Path to a response data element to be used as the physical id.
   */
  public open fun responsePath(): String? = unwrap(this).getResponsePath()

  public companion object {
    public fun fromResponse(responsePath: String): PhysicalResourceId =
        software.amazon.awscdk.customresources.PhysicalResourceId.fromResponse(responsePath).let(PhysicalResourceId::wrap)

    public fun of(id: String): PhysicalResourceId =
        software.amazon.awscdk.customresources.PhysicalResourceId.of(id).let(PhysicalResourceId::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.PhysicalResourceId):
        PhysicalResourceId = PhysicalResourceId(cdkObject)

    internal fun unwrap(wrapped: PhysicalResourceId):
        software.amazon.awscdk.customresources.PhysicalResourceId = wrapped.cdkObject as
        software.amazon.awscdk.customresources.PhysicalResourceId
  }
}

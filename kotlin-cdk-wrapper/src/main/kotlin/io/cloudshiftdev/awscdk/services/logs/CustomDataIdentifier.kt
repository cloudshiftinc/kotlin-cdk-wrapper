@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import kotlin.String

/**
 * A custom data identifier.
 *
 * Include a custom data identifier name and regular expression in the JSON policy used to define
 * the data protection policy.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.alpha.*;
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.destinations.alpha.*;
 * LogGroup logGroupDestination = LogGroup.Builder.create(this, "LogGroupLambdaAudit")
 * .logGroupName("auditDestinationForCDK")
 * .build();
 * Bucket bucket = new Bucket(this, "audit-bucket");
 * S3Bucket s3Destination = new S3Bucket(bucket);
 * DeliveryStream deliveryStream = DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destinations(List.of(s3Destination))
 * .build();
 * DataProtectionPolicy dataProtectionPolicy = DataProtectionPolicy.Builder.create()
 * .name("data protection policy")
 * .description("policy description")
 * .identifiers(List.of(DataIdentifier.DRIVERSLICENSE_US,  // managed data identifier
 * new DataIdentifier("EmailAddress"),  // forward compatibility for new managed data identifiers
 * new CustomDataIdentifier("EmployeeId", "EmployeeId-\\d{9}"))) // custom data identifier
 * .logGroupAuditDestination(logGroupDestination)
 * .s3BucketAuditDestination(bucket)
 * .deliveryStreamNameAuditDestination(deliveryStream.getDeliveryStreamName())
 * .build();
 * LogGroup.Builder.create(this, "LogGroupLambda")
 * .logGroupName("cdkIntegLogGroup")
 * .dataProtectionPolicy(dataProtectionPolicy)
 * .build();
 * ```
 */
public open class CustomDataIdentifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CustomDataIdentifier,
) : DataIdentifier(cdkObject) {
  public constructor(name: String, regex: String) :
      this(software.amazon.awscdk.services.logs.CustomDataIdentifier(name, regex))

  /**
   * * the name of the custom data identifier.
   *
   * This cannot share the same name as a managed data identifier.
   */
  public override fun name(): String = unwrap(this).getName()

  /**
   * * the regular expresssion to detect and mask log events for.
   */
  public open fun regex(): String = unwrap(this).getRegex()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CustomDataIdentifier):
        CustomDataIdentifier = CustomDataIdentifier(cdkObject)

    internal fun unwrap(wrapped: CustomDataIdentifier):
        software.amazon.awscdk.services.logs.CustomDataIdentifier = wrapped.cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.actions.AddHeader

/**
 * Adds a header to the received email.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.ses.actions.*;
 * Bucket bucket = new Bucket(this, "Bucket");
 * Topic topic = new Topic(this, "Topic");
 * ReceiptRuleSet.Builder.create(this, "RuleSet")
 * .rules(List.of(ReceiptRuleOptions.builder()
 * .recipients(List.of("hello&#64;aws.com"))
 * .actions(List.of(
 * AddHeader.Builder.create()
 * .name("X-Special-Header")
 * .value("aws")
 * .build(),
 * S3.Builder.create()
 * .bucket(bucket)
 * .objectKeyPrefix("emails/")
 * .topic(topic)
 * .build()))
 * .build(), ReceiptRuleOptions.builder()
 * .recipients(List.of("aws.com"))
 * .actions(List.of(
 * Sns.Builder.create()
 * .topic(topic)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class AddHeaderDsl {
  private val cdkBuilder: AddHeader.Builder = AddHeader.Builder.create()

  /**
   * The name of the header to add.
   *
   * Must be between 1 and 50 characters,
   * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters
   * and dashes only.
   *
   * @param name The name of the header to add. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The value of the header to add.
   *
   * Must be less than 2048 characters,
   * and must not contain newline characters ("\r" or "\n").
   *
   * @param value The value of the header to add. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): AddHeader = cdkBuilder.build()
}

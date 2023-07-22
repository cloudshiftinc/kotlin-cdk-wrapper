@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps

@CdkDslMarker
public class CfnVerifiedAccessGroupPropsDsl {
  private val cdkBuilder: CfnVerifiedAccessGroupProps.Builder =
      CfnVerifiedAccessGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description for the AWS Verified Access group.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param policyDocument The Verified Access policy document.
   */
  public fun policyDocument(policyDocument: String) {
    cdkBuilder.policyDocument(policyDocument)
  }

  /**
   * @param policyEnabled The status of the Verified Access policy.
   */
  public fun policyEnabled(policyEnabled: Boolean) {
    cdkBuilder.policyEnabled(policyEnabled)
  }

  /**
   * @param policyEnabled The status of the Verified Access policy.
   */
  public fun policyEnabled(policyEnabled: IResolvable) {
    cdkBuilder.policyEnabled(policyEnabled)
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param verifiedAccessInstanceId The ID of the AWS Verified Access instance. 
   */
  public fun verifiedAccessInstanceId(verifiedAccessInstanceId: String) {
    cdkBuilder.verifiedAccessInstanceId(verifiedAccessInstanceId)
  }

  public fun build(): CfnVerifiedAccessGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

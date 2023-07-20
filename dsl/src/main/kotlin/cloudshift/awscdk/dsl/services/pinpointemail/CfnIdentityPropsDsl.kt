@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import software.amazon.awscdk.services.pinpointemail.CfnIdentityProps

@CdkDslMarker
public class CfnIdentityPropsDsl {
  private val cdkBuilder: CfnIdentityProps.Builder = CfnIdentityProps.builder()

  private val _tags: MutableList<CfnIdentity.TagsProperty> = mutableListOf()

  public fun dkimSigningEnabled(dkimSigningEnabled: Boolean) {
    cdkBuilder.dkimSigningEnabled(dkimSigningEnabled)
  }

  public fun dkimSigningEnabled(dkimSigningEnabled: IResolvable) {
    cdkBuilder.dkimSigningEnabled(dkimSigningEnabled)
  }

  public fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean) {
    cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled)
  }

  public fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable) {
    cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled)
  }

  public fun mailFromAttributes(mailFromAttributes: IResolvable) {
    cdkBuilder.mailFromAttributes(mailFromAttributes)
  }

  public fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty) {
    cdkBuilder.mailFromAttributes(mailFromAttributes)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnIdentityTagsPropertyDsl.() -> Unit) {
    _tags.add(CfnIdentityTagsPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnIdentity.TagsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnIdentityProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

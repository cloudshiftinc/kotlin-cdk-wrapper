@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnListener
import software.constructs.Construct

@CdkDslMarker
public class CfnListenerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnListener.Builder = CfnListener.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The action for the default rule.
   *
   * Each listener has a default rule. Each rule consists of a priority, one or more actions, and
   * one or more conditions. The default rule is the rule that's used if no other rules match. Each
   * rule must include exactly one of the following types of actions: `forward` or `fixed-response` ,
   * and it must be the last action to be performed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
   * @param defaultAction The action for the default rule. 
   */
  public fun defaultAction(defaultAction: IResolvable) {
    cdkBuilder.defaultAction(defaultAction)
  }

  /**
   * The action for the default rule.
   *
   * Each listener has a default rule. Each rule consists of a priority, one or more actions, and
   * one or more conditions. The default rule is the rule that's used if no other rules match. Each
   * rule must include exactly one of the following types of actions: `forward` or `fixed-response` ,
   * and it must be the last action to be performed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
   * @param defaultAction The action for the default rule. 
   */
  public fun defaultAction(defaultAction: CfnListener.DefaultActionProperty) {
    cdkBuilder.defaultAction(defaultAction)
  }

  /**
   * The name of the listener.
   *
   * A listener name must be unique within a service. The valid characters are a-z, 0-9, and hyphens
   * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
   *
   * If you don't specify a name, CloudFormation generates one. However, if you specify a name, and
   * later want to replace the resource, you must specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-name)
   * @param name The name of the listener. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The listener port.
   *
   * You can specify a value from `1` to `65535` . For HTTP, the default is `80` . For HTTPS, the
   * default is `443` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-port)
   * @param port The listener port. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * The listener protocol HTTP or HTTPS.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-protocol)
   * @param protocol The listener protocol HTTP or HTTPS. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-serviceidentifier)
   * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. 
   */
  public fun serviceIdentifier(serviceIdentifier: String) {
    cdkBuilder.serviceIdentifier(serviceIdentifier)
  }

  /**
   * The tags for the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-tags)
   * @param tags The tags for the listener. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-tags)
   * @param tags The tags for the listener. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnListener {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

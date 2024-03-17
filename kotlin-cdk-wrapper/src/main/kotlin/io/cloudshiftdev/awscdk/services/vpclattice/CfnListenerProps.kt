@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnListener`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnListenerProps cfnListenerProps = CfnListenerProps.builder()
 * .defaultAction(DefaultActionProperty.builder()
 * .fixedResponse(FixedResponseProperty.builder()
 * .statusCode(123)
 * .build())
 * .forward(ForwardProperty.builder()
 * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
 * .targetGroupIdentifier("targetGroupIdentifier")
 * // the properties below are optional
 * .weight(123)
 * .build()))
 * .build())
 * .build())
 * .protocol("protocol")
 * // the properties below are optional
 * .name("name")
 * .port(123)
 * .serviceIdentifier("serviceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html)
 */
public interface CfnListenerProps {
  /**
   * The action for the default rule.
   *
   * Each listener has a default rule. The default rule is used if no other rules match.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
   */
  public fun defaultAction(): Any

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
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The listener port.
   *
   * You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default is
   * 443.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The listener protocol.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-protocol)
   */
  public fun protocol(): String

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-serviceidentifier)
   */
  public fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  /**
   * The tags for the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnListenerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultAction The action for the default rule. 
     * Each listener has a default rule. The default rule is used if no other rules match.
     */
    public fun defaultAction(defaultAction: IResolvable)

    /**
     * @param defaultAction The action for the default rule. 
     * Each listener has a default rule. The default rule is used if no other rules match.
     */
    public fun defaultAction(defaultAction: CfnListener.DefaultActionProperty)

    /**
     * @param defaultAction The action for the default rule. 
     * Each listener has a default rule. The default rule is used if no other rules match.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7daaf940f20fcfd6eb61efd65478f8466ed33ef8bedba28e936ff918913ca348")
    public fun defaultAction(defaultAction: CfnListener.DefaultActionProperty.Builder.() -> Unit)

    /**
     * @param name The name of the listener.
     * A listener name must be unique within a service. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     * hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    public fun name(name: String)

    /**
     * @param port The listener port.
     * You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default
     * is 443.
     */
    public fun port(port: Number)

    /**
     * @param protocol The listener protocol. 
     */
    public fun protocol(protocol: String)

    /**
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service.
     */
    public fun serviceIdentifier(serviceIdentifier: String)

    /**
     * @param tags The tags for the listener.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the listener.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnListenerProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnListenerProps.builder()

    /**
     * @param defaultAction The action for the default rule. 
     * Each listener has a default rule. The default rule is used if no other rules match.
     */
    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    /**
     * @param defaultAction The action for the default rule. 
     * Each listener has a default rule. The default rule is used if no other rules match.
     */
    override fun defaultAction(defaultAction: CfnListener.DefaultActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(CfnListener.DefaultActionProperty::unwrap))
    }

    /**
     * @param defaultAction The action for the default rule. 
     * Each listener has a default rule. The default rule is used if no other rules match.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7daaf940f20fcfd6eb61efd65478f8466ed33ef8bedba28e936ff918913ca348")
    override fun defaultAction(defaultAction: CfnListener.DefaultActionProperty.Builder.() -> Unit):
        Unit = defaultAction(CfnListener.DefaultActionProperty(defaultAction))

    /**
     * @param name The name of the listener.
     * A listener name must be unique within a service. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     * hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param port The listener port.
     * You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default
     * is 443.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The listener protocol. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service.
     */
    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    /**
     * @param tags The tags for the listener.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the listener.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnListenerProps,
  ) : CdkObject(cdkObject), CfnListenerProps {
    /**
     * The action for the default rule.
     *
     * Each listener has a default rule. The default rule is used if no other rules match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
     */
    override fun defaultAction(): Any = unwrap(this).getDefaultAction()

    /**
     * The name of the listener.
     *
     * A listener name must be unique within a service. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     * hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The listener port.
     *
     * You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default
     * is 443.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The listener protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-protocol)
     */
    override fun protocol(): String = unwrap(this).getProtocol()

    /**
     * The ID or Amazon Resource Name (ARN) of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-serviceidentifier)
     */
    override fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

    /**
     * The tags for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListenerProps):
        CfnListenerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnListenerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerProps):
        software.amazon.awscdk.services.vpclattice.CfnListenerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnListenerProps
  }
}

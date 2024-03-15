@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSubscriptionDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object tags;
 * CfnSubscriptionDefinitionProps cfnSubscriptionDefinitionProps =
 * CfnSubscriptionDefinitionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .initialVersion(SubscriptionDefinitionVersionProperty.builder()
 * .subscriptions(List.of(SubscriptionProperty.builder()
 * .id("id")
 * .source("source")
 * .subject("subject")
 * .target("target")
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
 */
public interface CfnSubscriptionDefinitionProps {
  /**
   * The subscription definition version to include when the subscription definition is created.
   *
   * A subscription definition version contains a list of
   * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
   * property types.
   *
   *
   * To associate a subscription definition version after the subscription definition is created,
   * create an
   * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
   * resource and specify the ID of this subscription definition.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
   */
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The name of the subscription definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-name)
   */
  public fun name(): String

  /**
   * Application-specific metadata to attach to the subscription definition.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
   * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
   * the *Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnSubscriptionDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created.
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created.
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     */
    public
        fun initialVersion(initialVersion: CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty)

    /**
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created.
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bb8e2e15c8c40d48c8b399164522da15761922c2b61d2b561835afa8512a51")
    public
        fun initialVersion(initialVersion: CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * @param name The name of the subscription definition. 
     */
    public fun name(name: String)

    /**
     * @param tags Application-specific metadata to attach to the subscription definition.
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps.builder()

    /**
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created.
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created.
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     */
    override
        fun initialVersion(initialVersion: CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty::unwrap))
    }

    /**
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created.
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bb8e2e15c8c40d48c8b399164522da15761922c2b61d2b561835afa8512a51")
    override
        fun initialVersion(initialVersion: CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.Builder.() -> Unit):
        Unit =
        initialVersion(CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty(initialVersion))

    /**
     * @param name The name of the subscription definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Application-specific metadata to attach to the subscription definition.
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps,
  ) : CdkObject(cdkObject), CfnSubscriptionDefinitionProps {
    /**
     * The subscription definition version to include when the subscription definition is created.
     *
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
     */
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    /**
     * The name of the subscription definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Application-specific metadata to attach to the subscription definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubscriptionDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps):
        CfnSubscriptionDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps
  }
}

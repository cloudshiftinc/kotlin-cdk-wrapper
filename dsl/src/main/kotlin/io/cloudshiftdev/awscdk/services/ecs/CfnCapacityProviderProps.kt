package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCapacityProviderProps {
  /**
   * The Auto Scaling group settings for the capacity provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
   */
  public fun autoScalingGroupProvider(): Any

  /**
   * The name of the capacity provider.
   *
   * If a name is specified, it cannot start with `aws` , `ecs` , or `fargate` . If no name is
   * specified, a default name in the `CFNStackName-CFNResourceName-RandomString` format is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The metadata that you apply to the capacity provider to help you categorize and organize it.
   *
   * Each tag consists of a key and an optional value. You define both.
   *
   * The following basic restrictions apply to tags:
   *
   * * Maximum number of tags per resource - 50
   * * For each resource, each tag key must be unique, and each tag key can have only one value.
   * * Maximum key length - 128 Unicode characters in UTF-8
   * * Maximum value length - 256 Unicode characters in UTF-8
   * * If your tagging schema is used across multiple services and resources, remember that other
   * services may have restrictions on allowed characters. Generally allowed characters are: letters,
   * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCapacityProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    public fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable)

    /**
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    public
        fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty)

    /**
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fc44dc003eac75329c00cde7b7197884272f4d231cfb1a2efc6554d839cd80f")
    public
        fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder.() -> Unit)

    /**
     * @param name The name of the capacity provider.
     * If a name is specified, it cannot start with `aws` , `ecs` , or `fargate` . If no name is
     * specified, a default name in the `CFNStackName-CFNResourceName-RandomString` format is used.
     */
    public fun name(name: String)

    /**
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     * organize it.
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     * organize it.
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnCapacityProviderProps.Builder =
        software.amazon.awscdk.services.ecs.CfnCapacityProviderProps.builder()

    /**
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    override fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable) {
      cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider.let(IResolvable::unwrap))
    }

    /**
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    override
        fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty) {
      cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider.let(CfnCapacityProvider.AutoScalingGroupProviderProperty::unwrap))
    }

    /**
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fc44dc003eac75329c00cde7b7197884272f4d231cfb1a2efc6554d839cd80f")
    override
        fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder.() -> Unit):
        Unit =
        autoScalingGroupProvider(CfnCapacityProvider.AutoScalingGroupProviderProperty(autoScalingGroupProvider))

    /**
     * @param name The name of the capacity provider.
     * If a name is specified, it cannot start with `aws` , `ecs` , or `fargate` . If no name is
     * specified, a default name in the `CFNStackName-CFNResourceName-RandomString` format is used.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     * organize it.
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     * organize it.
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnCapacityProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProviderProps,
  ) : CdkObject(cdkObject), CfnCapacityProviderProps {
    /**
     * The Auto Scaling group settings for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
     */
    override fun autoScalingGroupProvider(): Any = unwrap(this).getAutoScalingGroupProvider()

    /**
     * The name of the capacity provider.
     *
     * If a name is specified, it cannot start with `aws` , `ecs` , or `fargate` . If no name is
     * specified, a default name in the `CFNStackName-CFNResourceName-RandomString` format is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The metadata that you apply to the capacity provider to help you categorize and organize it.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapacityProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProviderProps):
        CfnCapacityProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityProviderProps):
        software.amazon.awscdk.services.ecs.CfnCapacityProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CfnCapacityProviderProps
  }
}

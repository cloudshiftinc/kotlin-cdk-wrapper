@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .location("location")
 * // the properties below are optional
 * .notificationArns(List.of("notificationArns"))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .timeoutInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html)
 */
public interface CfnApplicationProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
   */
  public fun location(): Any

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
   */
  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-timeoutinminutes)
   */
  public fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param location the value to be set. 
     */
    public fun location(location: String)

    /**
     * @param location the value to be set. 
     */
    public fun location(location: IResolvable)

    /**
     * @param location the value to be set. 
     */
    public fun location(location: CfnApplication.ApplicationLocationProperty)

    /**
     * @param location the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380c62d18d357eda3e048804a1bc201023aa933ba84b88e1781a9b9c0a0b0c09")
    public fun location(location: CfnApplication.ApplicationLocationProperty.Builder.() -> Unit)

    /**
     * @param notificationArns the value to be set.
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * @param notificationArns the value to be set.
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * @param parameters the value to be set.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters the value to be set.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param timeoutInMinutes the value to be set.
     */
    public fun timeoutInMinutes(timeoutInMinutes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.sam.CfnApplicationProps.builder()

    /**
     * @param location the value to be set. 
     */
    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    /**
     * @param location the value to be set. 
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param location the value to be set. 
     */
    override fun location(location: CfnApplication.ApplicationLocationProperty) {
      cdkBuilder.location(location.let(CfnApplication.ApplicationLocationProperty.Companion::unwrap))
    }

    /**
     * @param location the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380c62d18d357eda3e048804a1bc201023aa933ba84b88e1781a9b9c0a0b0c09")
    override fun location(location: CfnApplication.ApplicationLocationProperty.Builder.() -> Unit):
        Unit = location(CfnApplication.ApplicationLocationProperty(location))

    /**
     * @param notificationArns the value to be set.
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * @param notificationArns the value to be set.
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * @param parameters the value to be set.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters the value to be set.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param timeoutInMinutes the value to be set.
     */
    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnApplicationProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sam.CfnApplicationProps,
  ) : CdkObject(cdkObject),
      CfnApplicationProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
     */
    override fun location(): Any = unwrap(this).getLocation()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
     */
    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-timeoutinminutes)
     */
    override fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.sam.CfnApplicationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sam.CfnApplicationProps
  }
}

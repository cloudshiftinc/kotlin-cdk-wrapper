@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFramework`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * Object controlScope;
 * CfnFrameworkProps cfnFrameworkProps = CfnFrameworkProps.builder()
 * .frameworkControls(List.of(FrameworkControlProperty.builder()
 * .controlName("controlName")
 * // the properties below are optional
 * .controlInputParameters(List.of(ControlInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .controlScope(controlScope)
 * .build()))
 * // the properties below are optional
 * .frameworkDescription("frameworkDescription")
 * .frameworkName("frameworkName")
 * .frameworkTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html)
 */
public interface CfnFrameworkProps {
  /**
   * Contains detailed information about all of the controls of a framework.
   *
   * Each framework must contain at least one control.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
   */
  public fun frameworkControls(): Any

  /**
   * An optional description of the framework with a maximum 1,024 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkdescription)
   */
  public fun frameworkDescription(): String? = unwrap(this).getFrameworkDescription()

  /**
   * The unique name of a framework.
   *
   * This name is between 1 and 256 characters, starting with a letter, and consisting of letters
   * (a-z, A-Z), numbers (0-9), and underscores (_).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkname)
   */
  public fun frameworkName(): String? = unwrap(this).getFrameworkName()

  /**
   * The tags to assign to your framework.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworktags)
   */
  public fun frameworkTags(): List<CfnTag> = unwrap(this).getFrameworkTags()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A builder for [CfnFrameworkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     * Each framework must contain at least one control.
     */
    public fun frameworkControls(frameworkControls: IResolvable)

    /**
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     * Each framework must contain at least one control.
     */
    public fun frameworkControls(frameworkControls: List<Any>)

    /**
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     * Each framework must contain at least one control.
     */
    public fun frameworkControls(vararg frameworkControls: Any)

    /**
     * @param frameworkDescription An optional description of the framework with a maximum 1,024
     * characters.
     */
    public fun frameworkDescription(frameworkDescription: String)

    /**
     * @param frameworkName The unique name of a framework.
     * This name is between 1 and 256 characters, starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     */
    public fun frameworkName(frameworkName: String)

    /**
     * @param frameworkTags The tags to assign to your framework.
     */
    public fun frameworkTags(frameworkTags: List<CfnTag>)

    /**
     * @param frameworkTags The tags to assign to your framework.
     */
    public fun frameworkTags(vararg frameworkTags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnFrameworkProps.Builder =
        software.amazon.awscdk.services.backup.CfnFrameworkProps.builder()

    /**
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     * Each framework must contain at least one control.
     */
    override fun frameworkControls(frameworkControls: IResolvable) {
      cdkBuilder.frameworkControls(frameworkControls.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     * Each framework must contain at least one control.
     */
    override fun frameworkControls(frameworkControls: List<Any>) {
      cdkBuilder.frameworkControls(frameworkControls.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     * Each framework must contain at least one control.
     */
    override fun frameworkControls(vararg frameworkControls: Any): Unit =
        frameworkControls(frameworkControls.toList())

    /**
     * @param frameworkDescription An optional description of the framework with a maximum 1,024
     * characters.
     */
    override fun frameworkDescription(frameworkDescription: String) {
      cdkBuilder.frameworkDescription(frameworkDescription)
    }

    /**
     * @param frameworkName The unique name of a framework.
     * This name is between 1 and 256 characters, starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     */
    override fun frameworkName(frameworkName: String) {
      cdkBuilder.frameworkName(frameworkName)
    }

    /**
     * @param frameworkTags The tags to assign to your framework.
     */
    override fun frameworkTags(frameworkTags: List<CfnTag>) {
      cdkBuilder.frameworkTags(frameworkTags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param frameworkTags The tags to assign to your framework.
     */
    override fun frameworkTags(vararg frameworkTags: CfnTag): Unit =
        frameworkTags(frameworkTags.toList())

    public fun build(): software.amazon.awscdk.services.backup.CfnFrameworkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.backup.CfnFrameworkProps,
  ) : CdkObject(cdkObject), CfnFrameworkProps {
    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     */
    override fun frameworkControls(): Any = unwrap(this).getFrameworkControls()

    /**
     * An optional description of the framework with a maximum 1,024 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkdescription)
     */
    override fun frameworkDescription(): String? = unwrap(this).getFrameworkDescription()

    /**
     * The unique name of a framework.
     *
     * This name is between 1 and 256 characters, starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkname)
     */
    override fun frameworkName(): String? = unwrap(this).getFrameworkName()

    /**
     * The tags to assign to your framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworktags)
     */
    override fun frameworkTags(): List<CfnTag> = unwrap(this).getFrameworkTags()?.map(CfnTag::wrap)
        ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFrameworkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFrameworkProps):
        CfnFrameworkProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFrameworkProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFrameworkProps):
        software.amazon.awscdk.services.backup.CfnFrameworkProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.backup.CfnFrameworkProps
  }
}

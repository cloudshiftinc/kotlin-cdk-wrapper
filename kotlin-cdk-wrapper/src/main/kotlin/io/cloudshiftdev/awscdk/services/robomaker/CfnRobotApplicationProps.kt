@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRobotApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
 * CfnRobotApplicationProps cfnRobotApplicationProps = CfnRobotApplicationProps.builder()
 * .robotSoftwareSuite(RobotSoftwareSuiteProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .version("version")
 * .build())
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .environment("environment")
 * .name("name")
 * .sources(List.of(SourceConfigProperty.builder()
 * .architecture("architecture")
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build()))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html)
 */
public interface CfnRobotApplicationProps {
  /**
   * The current revision id.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-currentrevisionid)
   */
  public fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  /**
   * The environment of the robot application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-environment)
   */
  public fun environment(): String? = unwrap(this).getEnvironment()

  /**
   * The name of the robot application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The robot software suite used by the robot application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
   */
  public fun robotSoftwareSuite(): Any

  /**
   * The sources of the robot application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
   */
  public fun sources(): Any? = unwrap(this).getSources()

  /**
   * A map that contains tag keys and tag values that are attached to the robot application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnRobotApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param currentRevisionId The current revision id.
     */
    public fun currentRevisionId(currentRevisionId: String)

    /**
     * @param environment The environment of the robot application.
     */
    public fun environment(environment: String)

    /**
     * @param name The name of the robot application.
     */
    public fun name(name: String)

    /**
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable)

    /**
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    public
        fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty)

    /**
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("465541b994d723af2f27ebd701fa8f4b49ef12abc4463d563186284a6c80763d")
    public
        fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit)

    /**
     * @param sources The sources of the robot application.
     */
    public fun sources(sources: IResolvable)

    /**
     * @param sources The sources of the robot application.
     */
    public fun sources(sources: List<Any>)

    /**
     * @param sources The sources of the robot application.
     */
    public fun sources(vararg sources: Any)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to the robot
     * application.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.builder()

    /**
     * @param currentRevisionId The current revision id.
     */
    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    /**
     * @param environment The environment of the robot application.
     */
    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param name The name of the robot application.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    override fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    override
        fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(CfnRobotApplication.RobotSoftwareSuiteProperty.Companion::unwrap))
    }

    /**
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("465541b994d723af2f27ebd701fa8f4b49ef12abc4463d563186284a6c80763d")
    override
        fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit):
        Unit =
        robotSoftwareSuite(CfnRobotApplication.RobotSoftwareSuiteProperty(robotSoftwareSuite))

    /**
     * @param sources The sources of the robot application.
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sources The sources of the robot application.
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sources The sources of the robot application.
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * @param tags A map that contains tag keys and tag values that are attached to the robot
     * application.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps,
  ) : CdkObject(cdkObject), CfnRobotApplicationProps {
    /**
     * The current revision id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-currentrevisionid)
     */
    override fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

    /**
     * The environment of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-environment)
     */
    override fun environment(): String? = unwrap(this).getEnvironment()

    /**
     * The name of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The robot software suite used by the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
     */
    override fun robotSoftwareSuite(): Any = unwrap(this).getRobotSoftwareSuite()

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     */
    override fun sources(): Any? = unwrap(this).getSources()

    /**
     * A map that contains tag keys and tag values that are attached to the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRobotApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps):
        CfnRobotApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRobotApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRobotApplicationProps):
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps
  }
}

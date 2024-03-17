@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rekognition

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rekognition.*;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .projectName("projectName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-project.html)
 */
public interface CfnProjectProps {
  /**
   * The name of the project to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-project.html#cfn-rekognition-project-projectname)
   */
  public fun projectName(): String

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param projectName The name of the project to create. 
     */
    public fun projectName(projectName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rekognition.CfnProjectProps.Builder =
        software.amazon.awscdk.services.rekognition.CfnProjectProps.builder()

    /**
     * @param projectName The name of the project to create. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.rekognition.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rekognition.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    /**
     * The name of the project to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-project.html#cfn-rekognition-project-projectname)
     */
    override fun projectName(): String = unwrap(this).getProjectName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnProjectProps):
        CfnProjectProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProjectProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.rekognition.CfnProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rekognition.CfnProjectProps
  }
}

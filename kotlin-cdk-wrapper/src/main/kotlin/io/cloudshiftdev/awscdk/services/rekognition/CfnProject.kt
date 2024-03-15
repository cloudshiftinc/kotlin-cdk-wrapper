@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rekognition

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Rekognition::Project` type creates an Amazon Rekognition Custom Labels project.
 *
 * A project is a group of resources needed to create and manage versions of an Amazon Rekognition
 * Custom Labels model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rekognition.*;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
 * .projectName("projectName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-project.html)
 */
public open class CfnProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rekognition.CfnProject,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Returns the Amazon Resource Name of the project.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the project to create.
   */
  public open fun projectName(): String = unwrap(this).getProjectName()

  /**
   * The name of the project to create.
   */
  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rekognition.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the project to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-project.html#cfn-rekognition-project-projectname)
     * @param projectName The name of the project to create. 
     */
    public fun projectName(projectName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rekognition.CfnProject.Builder =
        software.amazon.awscdk.services.rekognition.CfnProject.Builder.create(scope, id)

    /**
     * The name of the project to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-project.html#cfn-rekognition-project-projectname)
     * @param projectName The name of the project to create. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.rekognition.CfnProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rekognition.CfnProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnProject): CfnProject
        = CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.rekognition.CfnProject
        = wrapped.cdkObject
  }
}

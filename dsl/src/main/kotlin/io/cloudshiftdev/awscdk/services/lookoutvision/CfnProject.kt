package io.cloudshiftdev.awscdk.services.lookoutvision

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lookoutvision.CfnProject,
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
   * The name of the project.
   */
  public open fun projectName(): String = unwrap(this).getProjectName()

  /**
   * The name of the project.
   */
  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lookoutvision.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutvision-project.html#cfn-lookoutvision-project-projectname)
     * @param projectName The name of the project. 
     */
    public fun projectName(projectName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lookoutvision.CfnProject.Builder =
        software.amazon.awscdk.services.lookoutvision.CfnProject.Builder.create(scope, id)

    /**
     * The name of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutvision-project.html#cfn-lookoutvision-project-projectname)
     * @param projectName The name of the project. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.lookoutvision.CfnProject =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lookoutvision.CfnProject):
        CfnProject = CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject):
        software.amazon.awscdk.services.lookoutvision.CfnProject = wrapped.cdkObject
  }
}

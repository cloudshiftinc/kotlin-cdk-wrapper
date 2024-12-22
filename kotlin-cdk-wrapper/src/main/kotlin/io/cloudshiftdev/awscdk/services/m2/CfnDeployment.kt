@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.m2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates and starts a deployment to deploy an application into a runtime environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.m2.*;
 * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
 * .applicationId("applicationId")
 * .applicationVersion(123)
 * .environmentId("environmentId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html)
 */
public open class CfnDeployment(
  cdkObject: software.amazon.awscdk.services.m2.CfnDeployment,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps,
  ) :
      this(software.amazon.awscdk.services.m2.CfnDeployment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeploymentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeploymentProps(props)
  )

  /**
   * The unique identifier of the application.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier of the application.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The version of the application.
   */
  public open fun applicationVersion(): Number = unwrap(this).getApplicationVersion()

  /**
   * The version of the application.
   */
  public open fun applicationVersion(`value`: Number) {
    unwrap(this).setApplicationVersion(`value`)
  }

  /**
   * The unique identifier of the deployment.
   */
  public open fun attrDeploymentId(): String = unwrap(this).getAttrDeploymentId()

  /**
   * The current status of the deployment.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The unique identifier of the runtime environment.
   */
  public open fun environmentId(): String = unwrap(this).getEnvironmentId()

  /**
   * The unique identifier of the runtime environment.
   */
  public open fun environmentId(`value`: String) {
    unwrap(this).setEnvironmentId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.m2.CfnDeployment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-applicationid)
     * @param applicationId The unique identifier of the application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The version of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-applicationversion)
     * @param applicationVersion The version of the application. 
     */
    public fun applicationVersion(applicationVersion: Number)

    /**
     * The unique identifier of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-environmentid)
     * @param environmentId The unique identifier of the runtime environment. 
     */
    public fun environmentId(environmentId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnDeployment.Builder =
        software.amazon.awscdk.services.m2.CfnDeployment.Builder.create(scope, id)

    /**
     * The unique identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-applicationid)
     * @param applicationId The unique identifier of the application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The version of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-applicationversion)
     * @param applicationVersion The version of the application. 
     */
    override fun applicationVersion(applicationVersion: Number) {
      cdkBuilder.applicationVersion(applicationVersion)
    }

    /**
     * The unique identifier of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-environmentid)
     * @param environmentId The unique identifier of the runtime environment. 
     */
    override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnDeployment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.m2.CfnDeployment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeployment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeployment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnDeployment): CfnDeployment =
        CfnDeployment(cdkObject)

    internal fun unwrap(wrapped: CfnDeployment): software.amazon.awscdk.services.m2.CfnDeployment =
        wrapped.cdkObject as software.amazon.awscdk.services.m2.CfnDeployment
  }
}

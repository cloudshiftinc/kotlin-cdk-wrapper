@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CodeDeploy Application that deploys to an AWS Lambda function.
 *
 * Example:
 *
 * ```
 * LambdaApplication application = LambdaApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
public open class LambdaApplication(
  cdkObject: software.amazon.awscdk.services.codedeploy.LambdaApplication,
) : Resource(cdkObject),
    ILambdaApplication {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codedeploy.LambdaApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LambdaApplicationProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.LambdaApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(LambdaApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LambdaApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, LambdaApplicationProps(props)
  )

  /**
   *
   */
  public override fun applicationArn(): String = unwrap(this).getApplicationArn()

  /**
   *
   */
  public override fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.LambdaApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the CodeDeploy Application.
     *
     * Default: an auto-generated name will be used
     *
     * @param applicationName The physical, human-readable name of the CodeDeploy Application. 
     */
    public fun applicationName(applicationName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.LambdaApplication.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaApplication.Builder.create(scope, id)

    /**
     * The physical, human-readable name of the CodeDeploy Application.
     *
     * Default: an auto-generated name will be used
     *
     * @param applicationName The physical, human-readable name of the CodeDeploy Application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.codedeploy.LambdaApplication.PROPERTY_INJECTION_ID

    public fun fromLambdaApplicationArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      lambdaApplicationArn: String,
    ): ILambdaApplication =
        software.amazon.awscdk.services.codedeploy.LambdaApplication.fromLambdaApplicationArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, lambdaApplicationArn).let(ILambdaApplication::wrap)

    public fun fromLambdaApplicationName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      lambdaApplicationName: String,
    ): ILambdaApplication =
        software.amazon.awscdk.services.codedeploy.LambdaApplication.fromLambdaApplicationName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, lambdaApplicationName).let(ILambdaApplication::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaApplication):
        LambdaApplication = LambdaApplication(cdkObject)

    internal fun unwrap(wrapped: LambdaApplication):
        software.amazon.awscdk.services.codedeploy.LambdaApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.LambdaApplication
  }
}

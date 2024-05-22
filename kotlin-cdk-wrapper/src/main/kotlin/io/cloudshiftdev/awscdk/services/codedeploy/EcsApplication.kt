@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CodeDeploy Application that deploys to an Amazon ECS service.
 *
 * Example:
 *
 * ```
 * EcsApplication application = EcsApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
public open class EcsApplication(
  cdkObject: software.amazon.awscdk.services.codedeploy.EcsApplication,
) : Resource(cdkObject), IEcsApplication {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codedeploy.EcsApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsApplicationProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.EcsApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EcsApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, EcsApplicationProps(props)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.EcsApplication].
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
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.EcsApplication.Builder =
        software.amazon.awscdk.services.codedeploy.EcsApplication.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsApplication =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromEcsApplicationArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ecsApplicationArn: String,
    ): IEcsApplication =
        software.amazon.awscdk.services.codedeploy.EcsApplication.fromEcsApplicationArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, ecsApplicationArn).let(IEcsApplication::wrap)

    public fun fromEcsApplicationName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ecsApplicationName: String,
    ): IEcsApplication =
        software.amazon.awscdk.services.codedeploy.EcsApplication.fromEcsApplicationName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, ecsApplicationName).let(IEcsApplication::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsApplication):
        EcsApplication = EcsApplication(cdkObject)

    internal fun unwrap(wrapped: EcsApplication):
        software.amazon.awscdk.services.codedeploy.EcsApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.EcsApplication
  }
}

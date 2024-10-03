@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A principal for use in resources that need to have a role but it's unknown.
 *
 * Some resources have roles associated with them which they assume, such as
 * Lambda Functions, CodeBuild projects, StepFunctions machines, etc.
 *
 * When those resources are imported, their actual roles are not always
 * imported with them. When that happens, we use an instance of this class
 * instead, which will add user warnings when statements are attempted to be
 * added to it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import software.constructs.*;
 * Construct construct;
 * UnknownPrincipal unknownPrincipal = UnknownPrincipal.Builder.create()
 * .resource(construct)
 * .build();
 * ```
 */
public open class UnknownPrincipal(
  cdkObject: software.amazon.awscdk.services.iam.UnknownPrincipal,
) : CdkObject(cdkObject),
    IPrincipal {
  public constructor(props: UnknownPrincipalProps) :
      this(software.amazon.awscdk.services.iam.UnknownPrincipal(props.let(UnknownPrincipalProps.Companion::unwrap))
  )

  public constructor(props: UnknownPrincipalProps.Builder.() -> Unit) :
      this(UnknownPrincipalProps(props)
  )

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  public open fun addToPolicy(statement: PolicyStatement): Boolean =
      unwrap(this).addToPolicy(statement.let(PolicyStatement.Companion::unwrap))

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6148e52b961e7728ba57cdabfd202385d97a77f6d5da33adb746c32e8c75340f")
  public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean =
      addToPolicy(PolicyStatement(statement))

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  public override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
      unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToPrincipalPolicyResult::wrap)

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

  /**
   * When this Principal is used in an AssumeRole policy, the action to use.
   */
  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.UnknownPrincipal].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The resource the role proxy is for.
     *
     * @param resource The resource the role proxy is for. 
     */
    public fun resource(resource: IConstruct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.UnknownPrincipal.Builder =
        software.amazon.awscdk.services.iam.UnknownPrincipal.Builder.create()

    /**
     * The resource the role proxy is for.
     *
     * @param resource The resource the role proxy is for. 
     */
    override fun resource(resource: IConstruct) {
      cdkBuilder.resource(resource.let(IConstruct.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.UnknownPrincipal = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UnknownPrincipal {
      val builderImpl = BuilderImpl()
      return UnknownPrincipal(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.UnknownPrincipal):
        UnknownPrincipal = UnknownPrincipal(cdkObject)

    internal fun unwrap(wrapped: UnknownPrincipal):
        software.amazon.awscdk.services.iam.UnknownPrincipal = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.UnknownPrincipal
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.IConstruct as CloudshiftdevConstructsIConstruct
import software.constructs.IConstruct as SoftwareConstructsIConstruct

/**
 * Result of a grant() operation.
 *
 * This class is not instantiable by consumers on purpose, so that they will be
 * required to call the Grant factory functions.
 *
 * Example:
 *
 * ```
 * Instance instance;
 * Volume volume;
 * Grant attachGrant = volume.grantAttachVolumeByResourceTag(instance.getGrantPrincipal(),
 * List.of(instance));
 * Grant detachGrant = volume.grantDetachVolumeByResourceTag(instance.getGrantPrincipal(),
 * List.of(instance));
 * ```
 */
public open class Grant(
  cdkObject: software.amazon.awscdk.services.iam.Grant,
) : CdkObject(cdkObject),
    IDependable {
  /**
   * Make sure this grant is applied before the given constructs are deployed.
   *
   * The same as construct.node.addDependency(grant), but slightly nicer to read.
   *
   * @param constructs 
   */
  public open fun applyBefore(vararg constructs: CloudshiftdevConstructsIConstruct) {
    unwrap(this).applyBefore(*constructs.map{CdkObjectWrappers.unwrap(it) as
        SoftwareConstructsIConstruct}.toTypedArray())
  }

  /**
   * Throw an error if this grant wasn't successful.
   */
  public open fun assertSuccess() {
    unwrap(this).assertSuccess()
  }

  /**
   * Combine two grants into a new one.
   *
   * @param rhs 
   */
  public open fun combine(rhs: Grant): Grant =
      unwrap(this).combine(rhs.let(Grant.Companion::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) The statement that was added to the principal's policy.
   *
   * @deprecated Use `principalStatements` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun principalStatement(): PolicyStatement? =
      unwrap(this).getPrincipalStatement()?.let(PolicyStatement::wrap)

  /**
   * The statements that were added to the principal's policy.
   */
  public open fun principalStatements(): List<PolicyStatement> =
      unwrap(this).getPrincipalStatements().map(PolicyStatement::wrap)

  /**
   * (deprecated) The statement that was added to the resource policy.
   *
   * @deprecated Use `resourceStatements` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun resourceStatement(): PolicyStatement? =
      unwrap(this).getResourceStatement()?.let(PolicyStatement::wrap)

  /**
   * The statements that were added to the principal's policy.
   */
  public open fun resourceStatements(): List<PolicyStatement> =
      unwrap(this).getResourceStatements().map(PolicyStatement::wrap)

  /**
   * Whether the grant operation was successful.
   */
  public open fun success(): Boolean = unwrap(this).getSuccess()

  public companion object {
    public fun addToPrincipal(options: GrantOnPrincipalOptions): Grant =
        software.amazon.awscdk.services.iam.Grant.addToPrincipal(options.let(GrantOnPrincipalOptions.Companion::unwrap)).let(Grant::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("262301c1f5f1f4891aa3e11b1e5bf888d6abb225c4d4d928a53142ee7c436374")
    public fun addToPrincipal(options: GrantOnPrincipalOptions.Builder.() -> Unit): Grant =
        addToPrincipal(GrantOnPrincipalOptions(options))

    public fun addToPrincipalAndResource(options: GrantOnPrincipalAndResourceOptions): Grant =
        software.amazon.awscdk.services.iam.Grant.addToPrincipalAndResource(options.let(GrantOnPrincipalAndResourceOptions.Companion::unwrap)).let(Grant::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebcdd9f0c9e9ff70d6e4e619f79e7f55ccb8089bca3d40830d66eeb4ac507a76")
    public
        fun addToPrincipalAndResource(options: GrantOnPrincipalAndResourceOptions.Builder.() -> Unit):
        Grant = addToPrincipalAndResource(GrantOnPrincipalAndResourceOptions(options))

    public fun addToPrincipalOrResource(options: GrantWithResourceOptions): Grant =
        software.amazon.awscdk.services.iam.Grant.addToPrincipalOrResource(options.let(GrantWithResourceOptions.Companion::unwrap)).let(Grant::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13c508b7e078720e89980b7918f884c74f03eef6e6b2164e4eb9df04ee787328")
    public fun addToPrincipalOrResource(options: GrantWithResourceOptions.Builder.() -> Unit): Grant
        = addToPrincipalOrResource(GrantWithResourceOptions(options))

    public fun drop(grantee: IGrantable, intent: String): Grant =
        software.amazon.awscdk.services.iam.Grant.drop(grantee.let(IGrantable.Companion::unwrap),
        intent).let(Grant::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.Grant): Grant =
        Grant(cdkObject)

    internal fun unwrap(wrapped: Grant): software.amazon.awscdk.services.iam.Grant =
        wrapped.cdkObject as software.amazon.awscdk.services.iam.Grant
  }
}

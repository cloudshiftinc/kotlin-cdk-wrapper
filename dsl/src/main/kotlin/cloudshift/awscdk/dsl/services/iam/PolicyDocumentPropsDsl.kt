@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.PolicyDocumentProps
import software.amazon.awscdk.services.iam.PolicyStatement

/**
 * Properties for a new PolicyDocument.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.iam.*;
 * PolicyDocument myFileSystemPolicy = PolicyDocument.Builder.create()
 * .statements(List.of(PolicyStatement.Builder.create()
 * .actions(List.of("elasticfilesystem:ClientWrite", "elasticfilesystem:ClientMount"))
 * .principals(List.of(new AccountRootPrincipal()))
 * .resources(List.of("*"))
 * .conditions(Map.of(
 * "Bool", Map.of(
 * "elasticfilesystem:AccessedViaMountTarget", "true")))
 * .build()))
 * .build();
 * FileSystem fileSystem = FileSystem.Builder.create(this, "MyEfsFileSystem")
 * .vpc(new Vpc(this, "VPC"))
 * .fileSystemPolicy(myFileSystemPolicy)
 * .build();
 * ```
 */
@CdkDslMarker
public class PolicyDocumentPropsDsl {
  private val cdkBuilder: PolicyDocumentProps.Builder = PolicyDocumentProps.builder()

  private val _statements: MutableList<PolicyStatement> = mutableListOf()

  /**
   * @param assignSids Automatically assign Statement Ids to all statements.
   */
  public fun assignSids(assignSids: Boolean) {
    cdkBuilder.assignSids(assignSids)
  }

  /**
   * @param minimize Try to minimize the policy by merging statements.
   * To avoid overrunning the maximum policy size, combine statements if they produce
   * the same result. Merging happens according to the following rules:
   *
   * * The Effect of both statements is the same
   * * Neither of the statements have a 'Sid'
   * * Combine Principals if the rest of the statement is exactly the same.
   * * Combine Resources if the rest of the statement is exactly the same.
   * * Combine Actions if the rest of the statement is exactly the same.
   * * We will never combine NotPrincipals, NotResources or NotActions, because doing
   * so would change the meaning of the policy document.
   */
  public fun minimize(minimize: Boolean) {
    cdkBuilder.minimize(minimize)
  }

  /**
   * @param statements Initial statements to add to the policy document.
   */
  public fun statements(statements: PolicyStatementDsl.() -> Unit) {
    _statements.add(PolicyStatementDsl().apply(statements).build())
  }

  /**
   * @param statements Initial statements to add to the policy document.
   */
  public fun statements(statements: Collection<PolicyStatement>) {
    _statements.addAll(statements)
  }

  public fun build(): PolicyDocumentProps {
    if(_statements.isNotEmpty()) cdkBuilder.statements(_statements)
    return cdkBuilder.build()
  }
}

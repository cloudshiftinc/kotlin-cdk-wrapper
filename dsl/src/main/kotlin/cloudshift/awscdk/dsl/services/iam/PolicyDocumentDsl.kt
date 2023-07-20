@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.iam.PolicyStatement

@CdkDslMarker
public class PolicyDocumentDsl {
  private val cdkBuilder: PolicyDocument.Builder = PolicyDocument.Builder.create()

  private val _statements: MutableList<PolicyStatement> = mutableListOf()

  public fun assignSids(assignSids: Boolean) {
    cdkBuilder.assignSids(assignSids)
  }

  public fun minimize(minimize: Boolean) {
    cdkBuilder.minimize(minimize)
  }

  public fun statements(statements: PolicyStatementDsl.() -> Unit) {
    _statements.add(PolicyStatementDsl().apply(statements).build())
  }

  public fun statements(statements: Collection<PolicyStatement>) {
    _statements.addAll(statements)
  }

  public fun build(): PolicyDocument {
    if(_statements.isNotEmpty()) cdkBuilder.statements(_statements)
    return cdkBuilder.build()
  }
}

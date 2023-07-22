@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sns.StringConditions

@CdkDslMarker
public class StringConditionsDsl {
  private val cdkBuilder: StringConditions.Builder = StringConditions.builder()

  private val _allowlist: MutableList<String> = mutableListOf()

  private val _denylist: MutableList<String> = mutableListOf()

  private val _matchPrefixes: MutableList<String> = mutableListOf()

  /**
   * @param allowlist Match one or more values.
   */
  public fun allowlist(vararg allowlist: String) {
    _allowlist.addAll(listOf(*allowlist))
  }

  /**
   * @param allowlist Match one or more values.
   */
  public fun allowlist(allowlist: Collection<String>) {
    _allowlist.addAll(allowlist)
  }

  /**
   * @param denylist Match any value that doesn't include any of the specified values.
   */
  public fun denylist(vararg denylist: String) {
    _denylist.addAll(listOf(*denylist))
  }

  /**
   * @param denylist Match any value that doesn't include any of the specified values.
   */
  public fun denylist(denylist: Collection<String>) {
    _denylist.addAll(denylist)
  }

  /**
   * @param matchPrefixes Matches values that begins with the specified prefixes.
   */
  public fun matchPrefixes(vararg matchPrefixes: String) {
    _matchPrefixes.addAll(listOf(*matchPrefixes))
  }

  /**
   * @param matchPrefixes Matches values that begins with the specified prefixes.
   */
  public fun matchPrefixes(matchPrefixes: Collection<String>) {
    _matchPrefixes.addAll(matchPrefixes)
  }

  public fun build(): StringConditions {
    if(_allowlist.isNotEmpty()) cdkBuilder.allowlist(_allowlist)
    if(_denylist.isNotEmpty()) cdkBuilder.denylist(_denylist)
    if(_matchPrefixes.isNotEmpty()) cdkBuilder.matchPrefixes(_matchPrefixes)
    return cdkBuilder.build()
  }
}

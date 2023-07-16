@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps

@CdkDslMarker
public class CfnCustomDataIdentifierPropsDsl {
  private val cdkBuilder: CfnCustomDataIdentifierProps.Builder =
      CfnCustomDataIdentifierProps.builder()

  private val _ignoreWords: MutableList<String> = mutableListOf()

  private val _keywords: MutableList<String> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun ignoreWords(vararg ignoreWords: String) {
    _ignoreWords.addAll(listOf(*ignoreWords))
  }

  public fun ignoreWords(ignoreWords: Collection<String>) {
    _ignoreWords.addAll(ignoreWords)
  }

  public fun keywords(vararg keywords: String) {
    _keywords.addAll(listOf(*keywords))
  }

  public fun keywords(keywords: Collection<String>) {
    _keywords.addAll(keywords)
  }

  public fun maximumMatchDistance(maximumMatchDistance: Number) {
    cdkBuilder.maximumMatchDistance(maximumMatchDistance)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun regex(regex: String) {
    cdkBuilder.regex(regex)
  }

  public fun build(): CfnCustomDataIdentifierProps {
    if(_ignoreWords.isNotEmpty()) cdkBuilder.ignoreWords(_ignoreWords)
    if(_keywords.isNotEmpty()) cdkBuilder.keywords(_keywords)
    return cdkBuilder.build()
  }
}

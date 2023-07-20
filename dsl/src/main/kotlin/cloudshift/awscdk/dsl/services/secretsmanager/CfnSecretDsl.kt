@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import software.constructs.Construct

@CdkDslMarker
public class CfnSecretDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecret.Builder = CfnSecret.Builder.create(scope, id)

  private val _replicaRegions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun generateSecretString(generateSecretString: IResolvable) {
    cdkBuilder.generateSecretString(generateSecretString)
  }

  public fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty) {
    cdkBuilder.generateSecretString(generateSecretString)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun replicaRegions(vararg replicaRegions: Any) {
    _replicaRegions.addAll(listOf(*replicaRegions))
  }

  public fun replicaRegions(replicaRegions: Collection<Any>) {
    _replicaRegions.addAll(replicaRegions)
  }

  public fun replicaRegions(replicaRegions: IResolvable) {
    cdkBuilder.replicaRegions(replicaRegions)
  }

  public fun secretString(secretString: String) {
    cdkBuilder.secretString(secretString)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSecret {
    if(_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

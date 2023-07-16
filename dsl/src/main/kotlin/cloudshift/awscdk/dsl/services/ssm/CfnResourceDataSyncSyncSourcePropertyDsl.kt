@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnResourceDataSync

@CdkDslMarker
public class CfnResourceDataSyncSyncSourcePropertyDsl {
  private val cdkBuilder: CfnResourceDataSync.SyncSourceProperty.Builder =
      CfnResourceDataSync.SyncSourceProperty.builder()

  private val _sourceRegions: MutableList<String> = mutableListOf()

  public fun awsOrganizationsSource(awsOrganizationsSource: IResolvable) {
    cdkBuilder.awsOrganizationsSource(awsOrganizationsSource)
  }

  public
      fun awsOrganizationsSource(awsOrganizationsSource: CfnResourceDataSync.AwsOrganizationsSourceProperty) {
    cdkBuilder.awsOrganizationsSource(awsOrganizationsSource)
  }

  public fun includeFutureRegions(includeFutureRegions: Boolean) {
    cdkBuilder.includeFutureRegions(includeFutureRegions)
  }

  public fun includeFutureRegions(includeFutureRegions: IResolvable) {
    cdkBuilder.includeFutureRegions(includeFutureRegions)
  }

  public fun sourceRegions(vararg sourceRegions: String) {
    _sourceRegions.addAll(listOf(*sourceRegions))
  }

  public fun sourceRegions(sourceRegions: Collection<String>) {
    _sourceRegions.addAll(sourceRegions)
  }

  public fun sourceType(sourceType: String) {
    cdkBuilder.sourceType(sourceType)
  }

  public fun build(): CfnResourceDataSync.SyncSourceProperty {
    if(_sourceRegions.isNotEmpty()) cdkBuilder.sourceRegions(_sourceRegions)
    return cdkBuilder.build()
  }
}

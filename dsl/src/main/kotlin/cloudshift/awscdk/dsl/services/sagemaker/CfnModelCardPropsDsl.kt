@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import software.amazon.awscdk.services.sagemaker.CfnModelCardProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelCardPropsDsl {
    private val cdkBuilder: CfnModelCardProps.Builder = CfnModelCardProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun content(content: IResolvable) {
        cdkBuilder.content(content)
    }

    public fun content(content: CfnModelCard.ContentProperty) {
        cdkBuilder.content(content)
    }

    public fun createdBy(createdBy: IResolvable) {
        cdkBuilder.createdBy(createdBy)
    }

    public fun createdBy(createdBy: CfnModelCard.UserContextProperty) {
        cdkBuilder.createdBy(createdBy)
    }

    public fun lastModifiedBy(lastModifiedBy: IResolvable) {
        cdkBuilder.lastModifiedBy(lastModifiedBy)
    }

    public fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty) {
        cdkBuilder.lastModifiedBy(lastModifiedBy)
    }

    public fun modelCardName(modelCardName: String) {
        cdkBuilder.modelCardName(modelCardName)
    }

    public fun modelCardStatus(modelCardStatus: String) {
        cdkBuilder.modelCardStatus(modelCardStatus)
    }

    public fun securityConfig(securityConfig: IResolvable) {
        cdkBuilder.securityConfig(securityConfig)
    }

    public fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty) {
        cdkBuilder.securityConfig(securityConfig)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnModelCardProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

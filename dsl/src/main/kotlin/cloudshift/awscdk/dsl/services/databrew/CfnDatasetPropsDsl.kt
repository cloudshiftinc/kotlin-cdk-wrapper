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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset
import software.amazon.awscdk.services.databrew.CfnDatasetProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDatasetPropsDsl {
    private val cdkBuilder: CfnDatasetProps.Builder = CfnDatasetProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun formatOptions(formatOptions: IResolvable) {
        cdkBuilder.formatOptions(formatOptions)
    }

    public fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty) {
        cdkBuilder.formatOptions(formatOptions)
    }

    public fun input(input: IResolvable) {
        cdkBuilder.input(input)
    }

    public fun input(input: CfnDataset.InputProperty) {
        cdkBuilder.input(input)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun pathOptions(pathOptions: IResolvable) {
        cdkBuilder.pathOptions(pathOptions)
    }

    public fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty) {
        cdkBuilder.pathOptions(pathOptions)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDatasetProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

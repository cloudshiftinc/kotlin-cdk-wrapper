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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.CodeCommitSourceProps
import software.amazon.awscdk.services.codecommit.IRepository
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CodeCommitSourcePropsDsl {
    private val cdkBuilder: CodeCommitSourceProps.Builder = CodeCommitSourceProps.builder()

    public fun branchOrRef(branchOrRef: String) {
        cdkBuilder.branchOrRef(branchOrRef)
    }

    public fun cloneDepth(cloneDepth: Number) {
        cdkBuilder.cloneDepth(cloneDepth)
    }

    public fun fetchSubmodules(fetchSubmodules: Boolean) {
        cdkBuilder.fetchSubmodules(fetchSubmodules)
    }

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun repository(repository: IRepository) {
        cdkBuilder.repository(repository)
    }

    public fun build(): CodeCommitSourceProps = cdkBuilder.build()
}
